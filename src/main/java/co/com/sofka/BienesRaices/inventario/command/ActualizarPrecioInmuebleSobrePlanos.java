package co.com.sofka.BienesRaices.inventario.command;

import co.com.sofka.BienesRaices.inventario.value.IdInmuebleSobrePlanos;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.BienesRaices.inventario.value.Precio;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.Entity;

public class ActualizarPrecioInmuebleSobrePlanos extends Command {

    private IdInventario idInventario;
    private IdInmuebleSobrePlanos entityId;
    private Precio precio;

    public void ActualizarPrecioInmueblrSobrePlanos(IdInventario idInventario, IdInmuebleSobrePlanos entityId, Precio precio) {
        this.idInventario = idInventario;
        this.entityId = entityId;
        this.precio = precio;
    }

    public IdInventario getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(IdInventario idInventario) {
        this.idInventario = idInventario;
    }

    public IdInmuebleSobrePlanos getEntityId() {
        return entityId;
    }

    public void setEntityId(IdInmuebleSobrePlanos entityId) {
        this.entityId = entityId;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }
}
