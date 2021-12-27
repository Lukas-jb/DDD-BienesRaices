package domain.empleado.event;

import domain.empleado.value.IdGerente;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoGerenteActualizado extends DomainEvent {
    private final IdGerente entityId;
    private final Telefono telefono;

    public TelefonoGerenteActualizado(IdGerente entityId, Telefono telefono) {
        super("sofka.Empleado.TelefonoGerenteActualizado");
        this.entityId = entityId;
        this.telefono = telefono;
    }

    public IdGerente getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
