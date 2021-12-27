package domain.inventario.event;

import domain.generic.Ubicacion;
import domain.inventario.value.Diseno;
import domain.inventario.value.IdInmuebleSobrePlanos;
import domain.inventario.value.Precio;
import domain.inventario.value.Tamano;
import co.com.sofka.domain.generic.DomainEvent;

public class InmuebleSobrePlanosAgregado extends DomainEvent {


    private final IdInmuebleSobrePlanos entityId;
    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private final Diseno diseno;
    private final Precio precio;

    public InmuebleSobrePlanosAgregado(IdInmuebleSobrePlanos entityId, Ubicacion ubicacion, Tamano tamano, Diseno diseno, Precio precio) {
        super("sofka.inventario.inmueblesobreplanosagregado");

        this.entityId = entityId;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.diseno = diseno;
        this.precio = precio;
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
