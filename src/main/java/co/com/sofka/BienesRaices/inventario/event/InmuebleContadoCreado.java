package co.com.sofka.BienesRaices.inventario.event;

import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.inventario.value.Precio;
import co.com.sofka.BienesRaices.inventario.value.Tamano;
import co.com.sofka.domain.generic.DomainEvent;

public class InmuebleContadoCreado extends DomainEvent {
    private final IdInmuebleContado entityId;
    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private final Precio precio;

    public InmuebleContadoCreado(IdInmuebleContado entityId, Ubicacion ubicacion, Tamano tamano, Precio precio) {
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
