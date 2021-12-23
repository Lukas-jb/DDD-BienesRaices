package co.com.sofka.BienesRaices.empleado.event;

import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreVendedorActualizado extends DomainEvent {
    private final IdEmpleado entityId;
    private final Nombre nombre;

    public NombreVendedorActualizado(IdEmpleado entityId, Nombre nombre) {
        super("sofka.Empleado.NombreVendedorActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdEmpleado getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
