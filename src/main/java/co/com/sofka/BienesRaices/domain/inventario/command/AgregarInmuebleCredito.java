package co.com.sofka.BienesRaices.domain.inventario.command;

import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.inventario.value.*;
import co.com.sofka.domain.generic.Command;

public class AgregarInmuebleCredito extends Command {
    private final IdInventario inventario;
    private final IdInmuebleCredito entityId;
    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private final Precio precio;
    private final CuotaInicial cuotaInicial;
    private final NumeroCuotas numeroCuotas;

    public AgregarInmuebleCredito(IdInventario idInventario, IdInmuebleCredito entityId, Ubicacion ubicacion, Tamano tamano, Precio precio, CuotaInicial cuotaInicial, NumeroCuotas numeroCuotas) {
        this.inventario = idInventario;
        this.entityId = entityId;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.precio = precio;
        this.cuotaInicial = cuotaInicial;
        this.numeroCuotas = numeroCuotas;
    }

    public IdInventario getInventario() {
        return inventario;
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
