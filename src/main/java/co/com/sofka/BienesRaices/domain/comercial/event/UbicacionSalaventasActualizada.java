package co.com.sofka.BienesRaices.domain.comercial.event;

import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInmuebleContado;
import co.com.sofka.domain.generic.DomainEvent;

public class UbicacionSalaventasActualizada extends DomainEvent {
    private final IdInmuebleContado entityId;
    private final Ubicacion ubicacion;

    public UbicacionSalaventasActualizada(IdInmuebleContado entityId, Ubicacion ubicacion) {
        super("spfka.");
        this.entityId = entityId;
        this.ubicacion = ubicacion;
    }

    public IdInmuebleContado getEntityId() {
        return entityId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
