package co.com.sofka.BienesRaices.inventario.command;


import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.BienesRaices.inventario.value.Precio;
import co.com.sofka.BienesRaices.inventario.value.Tamano;
import co.com.sofka.domain.generic.Command;

public class AgregarInmuebleContado extends Command {
    private IdInventario idInventario;
    private IdInmuebleContado entityId;
    private Ubicacion ubicacion;
    private Tamano tamano;
    private Precio precio;

    public void AgregarInmuebleContado(IdInventario idInventario, IdInmuebleContado entityId, Ubicacion ubicacion, Tamano tamano, Precio precio) {


        this.idInventario = idInventario;
        this.entityId = entityId;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.precio = precio;
    }

    public IdInventario getIdInventario() {
        return idInventario;
    }

    public IdInmuebleContado getEntityId() {
        return entityId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public Precio getPrecio() {
        return precio;
    }
}
