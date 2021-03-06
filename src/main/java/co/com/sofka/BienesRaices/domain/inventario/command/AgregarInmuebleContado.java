package co.com.sofka.BienesRaices.domain.inventario.command;


import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInventario;
import co.com.sofka.BienesRaices.domain.inventario.value.Precio;
import co.com.sofka.BienesRaices.domain.inventario.value.Tamano;
import co.com.sofka.domain.generic.Command;

public class AgregarInmuebleContado extends Command {
    private final IdInventario idInventario;
    private final IdInmuebleContado entityId;
    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private final Precio precio;

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
