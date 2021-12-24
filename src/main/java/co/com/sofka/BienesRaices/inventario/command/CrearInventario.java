package co.com.sofka.BienesRaices.inventario.command;

import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.domain.generic.Command;

public class CrearInventario extends Command {

    private final IdInventario entityId;
    private final Zona zona;

    public CrearInventario(IdInventario entityId, Zona zona) {
        this.entityId = entityId;
        this.zona = zona;
    }

    public IdInventario getEntityId() {
        return entityId;
    }

    public Zona getZona() {
        return zona;
    }
}
