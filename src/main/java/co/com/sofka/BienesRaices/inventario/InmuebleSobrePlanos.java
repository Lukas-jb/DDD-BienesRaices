package co.com.sofka.BienesRaices.inventario;

import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.value.*;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class InmuebleSobrePlanos extends Entity {
    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private final Diseno diseno;
    private  Precio precio;


    public InmuebleSobrePlanos(Identity entityId, Ubicacion ubicacion, Tamano tamano, Diseno diseno, Precio precio) {
        super(entityId);
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.diseno = diseno;
        this.precio = precio;
    }

    public void ActualizarPrecio(Precio precio) {
        this.precio = Objects.requireNonNull(precio);

    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }

    public Tamano Tamano() {
        return tamano;
    }

    public Diseno Diseno() {
        return diseno;
    }

    public Precio Precio() {
        return precio;
    }
}
