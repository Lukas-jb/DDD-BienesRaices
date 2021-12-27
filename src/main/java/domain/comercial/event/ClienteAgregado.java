package domain.comercial.event;

import domain.comercial.value.IdCliente;
import domain.generic.Nombre;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAgregado extends DomainEvent {
    private final IdCliente entityId;
    private final Nombre nombre;
    private final Telefono telefono;

    public ClienteAgregado(IdCliente entityId, Nombre nombre, Telefono telefono) {
        super("sofka.comerciol.ClientCreado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdCliente getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
