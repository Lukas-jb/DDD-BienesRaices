package domain.empleado.command;

import domain.empleado.value.IdEmpleado;
import domain.empleado.value.IdVendedor;
import domain.generic.Nombre;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.Command;

public class AgregarVendedor extends Command {
    private IdEmpleado idEmpleado;
    private IdVendedor entityId;
    private Nombre nombre;
    private Telefono telefono;

    public void AgregarVendedor(IdEmpleado idEmpleado, IdVendedor entityId, Nombre nombre, Telefono telefono) {
        this.idEmpleado = idEmpleado;
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
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
