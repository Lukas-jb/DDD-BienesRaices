package co.com.sofka.BienesRaices.domain.inventario.command;

import co.com.sofka.BienesRaices.domain.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInventario;
import co.com.sofka.BienesRaices.domain.inventario.value.Precio;
import co.com.sofka.domain.generic.Command;

public class ActualizarPrecioInmuebleContado extends Command {
    private IdInventario idInventario;
    private IdInmuebleContado entityId;
    private Precio precio;

    public void ActualizarPrecioInmueblrContado(IdInventario idInventario, IdInmuebleContado entityId, Precio precio) {

        this.idInventario = idInventario;
        this.entityId = entityId;
        this.precio = precio;
    }

    public IdInventario getIdInventario() {
        return idInventario;
    }

    public IdInmuebleContado getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
