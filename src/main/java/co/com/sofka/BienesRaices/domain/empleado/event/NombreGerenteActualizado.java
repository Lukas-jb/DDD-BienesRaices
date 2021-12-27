package co.com.sofka.BienesRaices.domain.empleado.event;

import co.com.sofka.BienesRaices.domain.empleado.value.IdGerente;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreGerenteActualizado extends DomainEvent {
    private final IdGerente entityId;
    private final Nombre nombre;

    public NombreGerenteActualizado(IdGerente entityId, Nombre nombre) {
        super("sofka.Empleado.NombreGerenteActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdGerente getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
