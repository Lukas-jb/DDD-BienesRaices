package co.com.sofka.BienesRaices.empleado.command;

import co.com.sofka.BienesRaices.empleado.value.IdGerente;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreGerente extends Command {
    private IdInventario idInventario;
    private IdGerente entityId;
    private Nombre nombre;

    public void ActualizarNombreGerente(IdInventario idInventario, IdGerente entityId, Nombre nombre) {
        this.idInventario = idInventario;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdInventario getIdInventario() {
        return idInventario;
    }

    public IdGerente getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
