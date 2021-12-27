package domain.inventario.command;


import domain.generic.Ubicacion;
import domain.inventario.value.IdInmuebleContado;
import domain.inventario.value.IdInventario;
import domain.inventario.value.Precio;
import domain.inventario.value.Tamano;
import co.com.sofka.domain.generic.Command;

public class AgregarInmuebleContado extends Command {
    private IdInventario idInventario;
    private IdInmuebleContado entityId;
    private Ubicacion ubicacion;
    private Tamano tamano;
    private Precio precio;

    public AgregarInmuebleContado(IdInventario idInventario, IdInmuebleContado entityId, Ubicacion ubicacion, Tamano tamano, Precio precio) {


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
