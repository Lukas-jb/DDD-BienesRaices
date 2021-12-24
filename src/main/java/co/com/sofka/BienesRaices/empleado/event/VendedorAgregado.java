package co.com.sofka.BienesRaices.empleado.event;

import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
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
