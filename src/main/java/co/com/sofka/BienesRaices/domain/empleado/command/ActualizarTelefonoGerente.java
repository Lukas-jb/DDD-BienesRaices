package co.com.sofka.BienesRaices.domain.empleado.command;

import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdGerente;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
import co.com.sofka.domain.generic.Command;

public class ActualizarTelefonoGerente extends Command {
    private IdEmpleado idEmpleado;
    private IdGerente entityId;
    private Telefono telefono;

    public void ActualizarTelefonoGerente(IdEmpleado idEmpleado, IdGerente entityId, Telefono telefono) {
        this.idEmpleado = idEmpleado;
        this.entityId = entityId;
        this.telefono = telefono;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public IdGerente getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
