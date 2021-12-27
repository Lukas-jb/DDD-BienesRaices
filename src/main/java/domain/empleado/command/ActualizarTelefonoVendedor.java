package domain.empleado.command;

import domain.empleado.value.IdEmpleado;
import domain.empleado.value.IdVendedor;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.Command;

public class ActualizarTelefonoVendedor extends Command {
    private IdEmpleado idEmpleado;
    private IdVendedor entityId;
    private Telefono telefono;

    public void ActualizarTelefonoVendedor(IdEmpleado idEmpleado, IdVendedor entityId, Telefono telefono) {
        this.idEmpleado = idEmpleado;
        this.entityId = entityId;
        this.telefono = telefono;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public IdVendedor getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
