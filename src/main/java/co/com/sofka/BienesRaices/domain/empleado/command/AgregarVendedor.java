package co.com.sofka.BienesRaices.domain.empleado.command;

import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
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
