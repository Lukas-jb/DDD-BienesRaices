package co.com.sofka.BienesRaices.domain.empleado.command;

import co.com.sofka.BienesRaices.domain.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInventario;
import co.com.sofka.domain.generic.Command;

public class ActualizarTelefonoAsesorCredito extends Command {

    private IdEmpleado idEmpleado;
    private IdAsesorCredito entityId;
    private Telefono telefono;

        public  ActualizarTelefonoAsesorCredito(IdEmpleado idEmpleado, IdAsesorCredito entityId, Telefono telefono) {
        this.idEmpleado = idEmpleado;
        this.entityId = entityId;
        this.telefono = telefono;
    }

    public IdEmpleado getIdIdEmpleado() {
        return idEmpleado;
    }

    public IdAsesorCredito getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
