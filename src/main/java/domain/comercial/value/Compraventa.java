package domain.comercial.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Compraventa implements ValueObject<String> {

    private final String value;
    public Compraventa(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La ubicacion no puede estar vacía");
        }
        if(this.value.length()<10){
            throw new IllegalArgumentException("La ubicacion no puede tener menos de ocho caracteres");
        }
        if(this.value.length()>500){
            throw new IllegalArgumentException("La ubicacion no puede tener más de cincuenta caracteres"); //Rn: El Cliente describe las condiciones para los acabados del Inmueble
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compraventa that = (Compraventa) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}