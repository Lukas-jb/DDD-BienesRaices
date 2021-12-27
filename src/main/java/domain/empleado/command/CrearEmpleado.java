package domain.empleado.command;

import domain.empleado.value.IdEmpleado;
import domain.generic.Zona;
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
