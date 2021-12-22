package co.com.sofka.BienesRaices.inventario;

import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.domain.generic.AggregateRoot;


public class Inventario extends AggregateRoot<IdInventario> {

    public Inventario(IdInventario entityId) {
        super(entityId);
    }
}
