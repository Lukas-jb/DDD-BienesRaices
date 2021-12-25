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
        if (this.value < 20000000) {
            throw new IllegalArgumentException("La cuota inicial no puede ser menor 20.000.000");
        }
    }

    @Override
    public Integer value() {
        return null;
    }
}
