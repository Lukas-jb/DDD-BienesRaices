package co.com.sofka.BienesRaices.comercial;

import co.com.sofka.BienesRaices.comercial.value.IdComercial;
import co.com.sofka.domain.generic.AggregateRoot;


public class Comercial extends AggregateRoot<IdComercial> {

    public Comercial(IdComercial entityId) {
        super(entityId);
    }
}
