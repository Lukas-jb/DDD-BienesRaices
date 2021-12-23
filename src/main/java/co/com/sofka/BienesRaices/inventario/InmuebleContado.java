package co.com.sofka.BienesRaices.inventario;

import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.inventario.value.Precio;
import co.com.sofka.BienesRaices.inventario.value.Tamano;
import co.com.sofka.domain.generic.Entity;


public class InmuebleContado extends Entity<IdInmuebleContado> {

    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private final Precio precio;

    public InmuebleContado(IdInmuebleContado entityId, Ubicacion ubicacion, Tamano tamano, Precio precio) {
        super(entityId);
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.precio = precio;
    }


    public Ubicacion Ubicacion() {
        return ubicacion;
    }

    public Tamano Tamaño() {
        return tamano;
    }

    public Precio Precio() {
        return precio;
    }
}
