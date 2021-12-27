package domain.empleado.command;

import domain.empleado.value.IdAsesorCredito;
import domain.generic.Nombre;
import domain.inventario.value.IdInventario;
import co.com.sofka.domain.generic.Command;

public class ActualizarTelefonoAsesorCredito extends Command {

    private IdInventario idInventario;
    private IdAsesorCredito entityId;
    private Nombre nombre;

    public void ActualizarTelefonoAsesorCredito(IdInventario idInventario, IdAsesorCredito entityId, Nombre nombre) {
        this.idInventario = idInventario;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdInventario getIdInventario() {
        return idInventario;
    }

    public IdAsesorCredito getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
