package domain.inventario.event;

import domain.generic.Ubicacion;
import domain.inventario.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class InmuebleCreditoAgregado extends DomainEvent {
    private final IdInmuebleCredito entityId;
    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private final Precio precio;
    private final CuotaInicial cuotaInicial;
    private final NumeroCuotas numeroCuotas;

    public InmuebleCreditoAgregado(IdInmuebleCredito entityId, Ubicacion ubicacion, Tamano tamano, Precio precio, CuotaInicial cuotaInicial, NumeroCuotas numeroCuotas) {
        super("sofka.inventario.inmueblecreditoagregado");
        this.entityId = entityId;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.precio = precio;
        this.cuotaInicial = cuotaInicial;
        this.numeroCuotas = numeroCuotas;
    }

    public IdInmuebleCredito getEntityId() {
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

    public CuotaInicial getCuotaInicial() {
        return cuotaInicial;
    }

    public NumeroCuotas getNumeroCuotas() {
        return numeroCuotas;
    }
}
