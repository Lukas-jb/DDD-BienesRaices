package co.com.sofka.BienesRaices.domain.generic;

import co.com.sofka.domain.generic.ValueObject;

public class Zona implements ValueObject<Zona.Valor> {

    private final Valor value;


    public Zona(Valor valor) {
        this.value = valor;
    }

    public enum Valor {
        NORTE,
        SUR,
        ORIENTE,
        OCCIDENTE
    }

    @Override
    public Valor value() {
        return value;
    }
}