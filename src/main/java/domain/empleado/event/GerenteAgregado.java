package domain.empleado.event;

import domain.empleado.value.IdGerente;
import domain.generic.Nombre;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class GerenteAgregado extends DomainEvent {
    private final IdGerente entityId;
    private final Nombre nombre;
    private final Telefono telefono;

    public GerenteAgregado(IdGerente entityId, Nombre nombre, Telefono telefono) {
        super("sofka.Empleado.GerenteAgregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdGerente getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
