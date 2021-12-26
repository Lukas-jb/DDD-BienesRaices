package co.com.sofka.BienesRaices.empleado.command;

import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.empleado.value.IdGerente;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.Command;

public class AgregarGerente extends Command {
    private IdEmpleado idEmpleado;
    private IdGerente entityId;
    private Nombre nombre;
    private Telefono telefono;

    public void AgregarGerente(IdEmpleado idEmpleado, IdGerente entityId, Nombre nombre, Telefono telefono) {
        this.idEmpleado = idEmpleado;
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
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

    public Telefono getTelefono() {
        return telefono;
    }
}
