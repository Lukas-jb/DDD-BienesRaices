package co.com.sofka.BienesRaices.empleado.event;

import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoGerenteActualizado extends DomainEvent {
    private final IdEmpleado entityId;
    private final Telefono telefono;

    public TelefonoGerenteActualizado(IdEmpleado entityId, Telefono telefono) {
        super("sofka.Empleado.TelefonoGerenteActualizado");
        this.entityId = entityId;
        this.telefono = telefono;
    }

    public IdEmpleado getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
