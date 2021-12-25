package co.com.sofka.BienesRaices.generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ubicacion implements ValueObject<String> {

    private final String value;

    public Ubicacion(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La ubicacion no puede estar vacía");
        }
        if (this.value.length() < 8) {
            throw new IllegalArgumentException("La ubicacion no puede tener menos de ocho caracteres");
        }
        if (this.value.length() > 50) {
            throw new IllegalArgumentException("La ubicacion no puede tener más de cincuenta caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion ubicacion = (Ubicacion) o;
        return Objects.equals(value, ubicacion.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
