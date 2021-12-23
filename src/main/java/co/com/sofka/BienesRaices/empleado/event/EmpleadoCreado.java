package co.com.sofka.BienesRaices.empleado.event;

import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoCreado extends DomainEvent {
    private final IdEmpleado entityId;
    private final Zona zona;

    public EmpleadoCreado(IdEmpleado entityId, Zona zona) {
        super("sofka.Empleado.EmpleadoCreado");
        this.entityId = entityId;
        this.zona = zona;
    }

    public IdEmpleado getEntityId() {
        return entityId;
    }

    public Zona getZona() {
        return zona;
    }
}
