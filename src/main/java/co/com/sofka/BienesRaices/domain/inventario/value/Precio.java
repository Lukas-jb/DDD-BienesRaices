package co.com.sofka.BienesRaices.domain.inventario.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Long> {

    private final Long value;

    public Precio(long value){
        this.value = Objects.requireNonNull(value);
        if(this.value == 0){
            throw new IllegalArgumentException("El Precio no puede ser cero");
        }
        if(this.value < 1000000){
            throw new IllegalArgumentException("El Precio no puede ser menor a siete cifras");
        }
        if(this.value > 2000000000){
            throw new IllegalArgumentException("El Precio no puede tener más de dies cifras");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precio precio = (Precio) o;
        return Objects.equals(value, precio.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Long value() {
        return value;
    }
}