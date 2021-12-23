package co.com.sofka.BienesRaices.empleado.event;

import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoAsesorCreditoActualizado extends DomainEvent {
    private final IdEmpleado entityId;
    private final Nombre nombre;

    public TelefonoAsesorCreditoActualizado(IdEmpleado entityId, Nombre nombre) {
        super("sofka.Empleado.TelefonoClienteActualizado");

        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdEmpleado getEntityId() {
        return entityId;
    }

    public Nombre getTelefono() {
        return nombre;
    }
}
