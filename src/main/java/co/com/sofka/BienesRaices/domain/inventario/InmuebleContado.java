package co.com.sofka.BienesRaices.domain.inventario;

import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.domain.inventario.value.Precio;
import co.com.sofka.BienesRaices.domain.inventario.value.Tamano;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;


public class InmuebleContado extends Entity<IdInmuebleContado> {

    protected final Ubicacion ubicacion;
    protected final Tamano tamano;
    protected Precio precio;

    public InmuebleContado(IdInmuebleContado entityId, Ubicacion ubicacion, Tamano tamano, Precio precio) {
        super(entityId);
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.precio = precio;
    }

    public void ActualizarPrecio(Precio precio) {
        this.precio = Objects.requireNonNull(precio);

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
