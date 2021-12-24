package co.com.sofka.BienesRaices.inventario;

import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.value.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class InmuebleCredito extends Entity<IdInmuebleCredito> {

    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private Precio precio;
    private final CuotaInicial cuotaInicial;
    private final NumeroCuotas numeroCuotas;

    public InmuebleCredito(IdInmuebleCredito entityId, Ubicacion ubicacion, Tamano tamano, Precio precio, CuotaInicial cuotaInicial, NumeroCuotas numeroCuotas) {
        super(entityId);
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.precio = precio;
        this.cuotaInicial = cuotaInicial;
        this.numeroCuotas = numeroCuotas;
    }

    public void ActualizarNumeroCuotas(NumeroCuotas numeroCuotas) {
        this.precio = Objects.requireNonNull(precio);
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }

    public Tamano Tamano() {
        return tamano;
    }

    public Precio Precio() {
        return precio;
    }

    public CuotaInicial CuotaInicial() {
        return cuotaInicial;
    }

    public NumeroCuotas Cuotas() {
        return numeroCuotas;
    }
}