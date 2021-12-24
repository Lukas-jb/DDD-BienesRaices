package co.com.sofka.BienesRaices.empleado.command;

import co.com.sofka.BienesRaices.empleado.value.IdGerente;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.domain.generic.Command;

public class AgregarGerente extends Command {

    private IdInventario idInventario;
    private IdGerente entityId;
    private Nombre nombre;
    private Telefono telefono;

    public void AgregarGerente(IdInventario idInventario, IdGerente entityId, Nombre nombre, Telefono telefono) {
        this.idInventario = idInventario;
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
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

    public Telefono getTelefono() {
        return telefono;
    }
}
