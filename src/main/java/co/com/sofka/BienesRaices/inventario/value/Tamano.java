package co.com.sofka.BienesRaices.inventario.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tamano implements ValueObject<Double> {

    private final double value;

    public Tamano(double value) {
        this.value = Objects.requireNonNull(value);
        if (this.value < 40) {
            throw new IllegalArgumentException("El tamaño no puede ser menor a 40 metros cuadrados");
        }
        if (this.value > 100000) {
            throw new IllegalArgumentException("El tamaño no puede tener más 100.000  metros cuadrados");
        }
    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tamano tamano = (Tamano) o;
        return Double.compare(tamano.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

