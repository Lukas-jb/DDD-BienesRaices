package domain.inventario.event;

import domain.generic.Ubicacion;
import domain.inventario.value.IdInmuebleContado;
import domain.inventario.value.Precio;
import domain.inventario.value.Tamano;
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
