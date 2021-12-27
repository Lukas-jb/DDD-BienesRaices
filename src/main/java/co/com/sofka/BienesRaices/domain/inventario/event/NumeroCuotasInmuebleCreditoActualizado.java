package co.com.sofka.BienesRaices.domain.inventario.event;

import co.com.sofka.BienesRaices.domain.inventario.value.IdInmuebleCredito;
import co.com.sofka.BienesRaices.domain.inventario.value.NumeroCuotas;
import co.com.sofka.domain.generic.DomainEvent;

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
