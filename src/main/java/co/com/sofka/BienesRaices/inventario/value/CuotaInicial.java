package co.com.sofka.BienesRaices.inventario.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CuotaInicial implements ValueObject<Integer> {

    private final int value;

    public CuotaInicial(int value) {
        this.value = Objects.requireNonNull(value);
        if (this.value == 0) {
            throw new IllegalArgumentException("La cuota inicial no puede ser cero");
        }
        if (this.value < 2000000) {
            throw new IllegalArgumentException("La cuota inicial no puede ser menor 20.000.000");
        }
        System.out.println(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuotaInicial that = (CuotaInicial) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Integer value() {
        return value;
    }
}
