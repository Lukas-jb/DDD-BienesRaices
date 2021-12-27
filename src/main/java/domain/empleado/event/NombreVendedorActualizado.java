package domain.empleado.event;

import domain.empleado.value.IdVendedor;
import domain.generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreVendedorActualizado extends DomainEvent {
    private final IdVendedor entityId;
    private final Nombre nombre;

    public NombreVendedorActualizado(IdVendedor entityId, Nombre nombre) {
        super("sofka.Empleado.NombreVendedorActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdVendedor getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
