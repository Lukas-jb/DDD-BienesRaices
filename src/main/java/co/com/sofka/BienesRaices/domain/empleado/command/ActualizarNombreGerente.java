package co.com.sofka.BienesRaices.domain.empleado.command;

import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdGerente;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInventario;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreGerente extends Command {
    private IdEmpleado idEmpleado;
    private IdGerente entityId;
    private Nombre nombre;

    public  ActualizarNombreGerente(IdEmpleado idEmpleado, IdGerente entityId, Nombre nombre) {
        this.idEmpleado = idEmpleado;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public IdGerente getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
