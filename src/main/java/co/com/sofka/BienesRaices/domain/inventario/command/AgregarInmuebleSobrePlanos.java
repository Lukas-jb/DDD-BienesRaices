package co.com.sofka.BienesRaices.domain.inventario.command;

import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.inventario.value.*;
import co.com.sofka.domain.generic.Command;

public class AgregarInmuebleSobrePlanos extends Command {

    private IdInventario idInventario;
    private IdInmuebleSobrePlanos entityId;
    private Ubicacion ubicacion;
    private Tamano tamano;
    private Diseno diseno;
    private Precio precio;

    public void AgregarInmuebleSobrePlanos(IdInventario idInventario, IdInmuebleSobrePlanos entityId, Ubicacion ubicacion, Tamano tamano, Diseno diseno, Precio precio) {

        this.idInventario = idInventario;
        this.entityId = entityId;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.diseno = diseno;
        this.precio = precio;
    }

    public IdInventario getIdInventario() {
        return idInventario;
    }

    public IdInmuebleSobrePlanos getEntityId() {
        return entityId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public Diseno getDiseno() {
        return diseno;
    }

    public Precio getPrecio() {
        return precio;
    }
}
