package co.com.sofka.BienesRaices.domain.inventario.event;

import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.domain.inventario.value.Precio;
import co.com.sofka.BienesRaices.domain.inventario.value.Tamano;
import co.com.sofka.domain.generic.DomainEvent;

public class InmuebleContadoAgregado extends DomainEvent {
    private final IdInmuebleContado entityId;
    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private final Precio precio;

    public InmuebleContadoAgregado(IdInmuebleContado entityId, Ubicacion ubicacion, Tamano tamano, Precio precio) {
        super("sofka.inmueble.inmueblecontadocreado");
        this.entityId = entityId;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.precio = precio;
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
