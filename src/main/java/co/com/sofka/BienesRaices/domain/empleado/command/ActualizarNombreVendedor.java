package co.com.sofka.BienesRaices.domain.empleado.command;

import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreVendedor extends Command {

    private IdEmpleado idEmpleado;
    private IdVendedor entityId;
    private Nombre nombre;

    public void ActualizarNombreVendedor(IdEmpleado idEmpleado, IdVendedor entityId, Nombre nombre) {
        this.idEmpleado = idEmpleado;
        this.entityId = entityId;
        this.nombre = nombre;
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
}
