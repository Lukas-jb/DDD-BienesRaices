package co.com.sofka.BienesRaices.domain.inventario.command;

import co.com.sofka.BienesRaices.domain.inventario.value.IdInmuebleCredito;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInventario;
import co.com.sofka.BienesRaices.domain.inventario.value.NumeroCuotas;
import co.com.sofka.domain.generic.Command;

public class ActualizarNumeroCuotasInmueblesCredito extends Command {

    private IdInventario inventario;
    private IdInmuebleCredito entityId;
    private NumeroCuotas numeroCuotas;

    public ActualizarNumeroCuotasInmueblesCredito(IdInventario inventario, IdInmuebleCredito entityId, NumeroCuotas numeroCuotas){
        this.inventario = inventario;
        this.entityId = entityId;
        this.numeroCuotas = numeroCuotas;
    }

    public IdInventario getInventario() {
        return inventario;
    }

    public IdInmuebleCredito getEntityId() {
        return entityId;
    }

    public NumeroCuotas getNumeroCuotas() {
        return numeroCuotas;
    }
}
