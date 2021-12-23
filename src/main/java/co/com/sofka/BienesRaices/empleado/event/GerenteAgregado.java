package co.com.sofka.BienesRaices.empleado.event;

import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class GerenteAgregado extends DomainEvent {
    private final IdEmpleado entityId;
    private final Nombre nombre;
    private final Telefono telefono;

    public GerenteAgregado(IdEmpleado entityId, Nombre nombre, Telefono telefono) {
        super("sofka.Empleado.GerenteAgregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdEmpleado getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
