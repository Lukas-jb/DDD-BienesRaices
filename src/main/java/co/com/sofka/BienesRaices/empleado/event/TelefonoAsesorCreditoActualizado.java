package co.com.sofka.BienesRaices.empleado.event;

import co.com.sofka.BienesRaices.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoAsesorCreditoActualizado extends DomainEvent {
    private final IdAsesorCredito entityId;
    private final Nombre nombre;

    public TelefonoAsesorCreditoActualizado(IdAsesorCredito entityId, Nombre nombre) {
        super("sofka.Empleado.TelefonoClienteActualizado");

        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdAsesorCredito getEntityId() {
        return entityId;
    }

    public Nombre getTelefono() {
        return nombre;
    }
}
