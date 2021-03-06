package co.com.sofka.BienesRaices.domain.empleado.command;

import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
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
