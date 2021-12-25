package co.com.sofka.BienesRaices.comercial.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorTotal implements ValueObject<Long> {

    private final Long value;

    public ValorTotal(long value) {
        this.value = Objects.requireNonNull(value);
        if (this.value == 0) {
            throw new IllegalArgumentException("El Precio no puede ser cero");
        }
        if (this.value < 1000000) {
            throw new IllegalArgumentException("El Precio no puede ser menor a siete cifras");
        }
        if (this.value > 2000000000) {
            throw new IllegalArgumentException("El Precio no puede tener más de dies cifras");
        }
    }

    @Override
    public Long value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValorTotal that = (ValorTotal) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}