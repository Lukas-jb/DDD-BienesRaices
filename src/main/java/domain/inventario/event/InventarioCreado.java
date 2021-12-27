package domain.inventario.event;

import domain.generic.Zona;
import domain.inventario.value.IdInventario;
import co.com.sofka.domain.generic.DomainEvent;

public class InventarioCreado extends DomainEvent {

    private final IdInventario entityId;
    private final Zona zona;

    public InventarioCreado(IdInventario entityId, Zona zona) {
        super("sofka.inventario.inventariocreado");
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
