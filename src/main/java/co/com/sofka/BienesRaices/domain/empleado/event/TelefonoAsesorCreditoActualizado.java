package co.com.sofka.BienesRaices.domain.empleado.event;

import co.com.sofka.BienesRaices.domain.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoAsesorCreditoActualizado extends DomainEvent {
    private final IdAsesorCredito entityId;
    private final Telefono telefono;

    public TelefonoAsesorCreditoActualizado(IdAsesorCredito entityId, Telefono telefono) {
        super("sofka.Empleado.TelefonoClienteActualizado");

        this.entityId = entityId;
        this.telefono = telefono;
    }

    public IdAsesorCredito getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
