package co.com.sofka.BienesRaices.comercial.event;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class ClientCreado extends DomainEvent {
    private final IdCliente entityId;
    private final Nombre nombre;
    private final Telefono telefono;

    public ClientCreado(IdCliente entityId, Nombre nombre, Telefono telefono) {
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
