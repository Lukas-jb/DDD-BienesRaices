package domain.comercial.event;

import domain.comercial.value.IdSalaVentas;
import domain.generic.Ubicacion;
import co.com.sofka.domain.generic.DomainEvent;

public class SalaVentasCreada extends DomainEvent {
    private final IdSalaVentas entityId;
    private final Ubicacion ubicacion;

    public SalaVentasCreada(IdSalaVentas entityId, Ubicacion ubicacion) {
        super("sofa.comercial.SalaVentasCreada");
        this.entityId = entityId;
        this.ubicacion = ubicacion;
    }

    public IdSalaVentas getEntityId() {
        return entityId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
