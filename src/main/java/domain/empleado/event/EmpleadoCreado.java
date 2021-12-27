package domain.empleado.event;

import domain.empleado.value.IdEmpleado;
import domain.generic.Zona;
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
