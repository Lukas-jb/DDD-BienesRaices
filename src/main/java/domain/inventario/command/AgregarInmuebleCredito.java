package domain.inventario.command;

import domain.generic.Ubicacion;
import domain.inventario.value.*;
import co.com.sofka.domain.generic.Command;

public class AgregarInmuebleCredito extends Command {
    private IdInventario inventario;
    private IdInmuebleCredito entityId;
    private Ubicacion ubicacion;
    private Tamano tamano;
    private Precio precio;
    private CuotaInicial cuotaInicial;
    private NumeroCuotas numeroCuotas;

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
