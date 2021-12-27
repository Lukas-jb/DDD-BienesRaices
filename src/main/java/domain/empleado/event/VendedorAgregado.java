package domain.empleado.event;

import domain.empleado.value.IdVendedor;
import domain.generic.Nombre;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class VendedorAgregado extends DomainEvent {
    private final IdVendedor entityId;
    private final Nombre nombre;
    private final Telefono telefono;

    public VendedorAgregado(IdVendedor entityId, Nombre nombre, Telefono telefono) {
        super("sofka.Empleado.VendedorAgregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdVendedor getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
