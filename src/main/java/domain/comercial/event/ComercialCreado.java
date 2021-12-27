package domain.comercial.event;

import domain.comercial.value.IdComercial;
import domain.generic.Telefono;
import domain.generic.Ubicacion;
import co.com.sofka.domain.generic.DomainEvent;

public class ComercialCreado extends DomainEvent {
    private final IdComercial entityId;
    private final Telefono telefono;
    private final Ubicacion ubicacion;

    public ComercialCreado(IdComercial entityId, Telefono telefono, Ubicacion ubicacion) {
        super("sofka.Comercial.ComercialCreado");
        this.entityId = entityId;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    public IdComercial getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
