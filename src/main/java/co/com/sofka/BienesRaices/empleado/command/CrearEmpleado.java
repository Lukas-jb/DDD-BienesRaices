package co.com.sofka.BienesRaices.empleado.command;

import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.domain.generic.Command;

public class CrearEmpleado extends Command {

    private final IdEmpleado entityId;
    private final Zona zona;

    public CrearEmpleado(IdEmpleado entityId, Zona zona) {
        this.entityId = entityId;
        this.zona = zona;
    }

    public IdEmpleado getEntityId() {
        return entityId;
    }

    public Zona getZona() {
        return zona;
    }
}
