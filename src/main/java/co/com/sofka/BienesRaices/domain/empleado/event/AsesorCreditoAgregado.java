package co.com.sofka.BienesRaices.domain.empleado.event;

import co.com.sofka.BienesRaices.domain.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class AsesorCreditoAgregado extends DomainEvent {
    private final IdAsesorCredito entityId;
    private final Nombre nombre;
    private final Telefono telefono;

    public AsesorCreditoAgregado(IdAsesorCredito entityId, Nombre nombre, Telefono telefono) {
        super("sofka.Empleado.ClienteAgregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdAsesorCredito getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
