package domain.empleado.command;

import domain.empleado.value.IdAsesorCredito;
import domain.empleado.value.IdEmpleado;
import domain.generic.Nombre;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.Command;

public class AgregarAsesorCredito extends Command {


    private IdEmpleado idEmpleado;
    private IdAsesorCredito entityId;
    private Nombre nombre;
    private Telefono telefono;

    public AgregarAsesorCredito(IdEmpleado idEmpleado , IdAsesorCredito entityId, Nombre nombre, Telefono telefono) {

        this.idEmpleado = idEmpleado;
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
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
