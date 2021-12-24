package co.com.sofka.BienesRaices.inventario.event;

import co.com.sofka.BienesRaices.inventario.value.IdInmuebleCredito;
import co.com.sofka.BienesRaices.inventario.value.NumeroCuotas;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;

public class NumeroCuotasInmuebleCreditoActualizado extends DomainEvent {


    private final IdInmuebleCredito entityId;
    private final NumeroCuotas numeroCuotas;

    public NumeroCuotasInmuebleCreditoActualizado(IdInmuebleCredito entityId, NumeroCuotas numeroCuotas) {
        super("sofka.Inventario.NumeroCuotasInmuebleActualizado");

        this.entityId = entityId;
        this.numeroCuotas = numeroCuotas;
    }

    public IdInmuebleCredito getEntityId() {
        return entityId;
    }

    public NumeroCuotas getNumeroCuotas() {
        return numeroCuotas;
    }
}
