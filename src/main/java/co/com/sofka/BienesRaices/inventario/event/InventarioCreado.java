package co.com.sofka.BienesRaices.inventario.event;

import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.domain.generic.DomainEvent;

public class InventarioCreado extends DomainEvent {

    private final IdInventario entityId;
    private final Zona zona;

    public InventarioCreado(IdInventario entityId, Zona zona) {
        super("sofka.inventario.inventariocreado");
        this.entityId = entityId;
        this.zona = zona;
    }
}
