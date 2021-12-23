package co.com.sofka.BienesRaices.inventario.event;

import co.com.sofka.BienesRaices.inventario.value.NumeroCuotas;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;

public class NumeroCuotasInmuebleActualizado extends DomainEvent {
    private final Identity entityId;
    private final NumeroCuotas numeroCuotas;

    public NumeroCuotasInmuebleActualizado(Identity entityId, NumeroCuotas numeroCuotas) {
        super("sofka.Inventario.NumeroCuotasInmuebleActualizado");
        this.entityId = entityId;
        this.numeroCuotas = numeroCuotas;
    }

    public Identity getEntityId() {
        return entityId;
    }

    public NumeroCuotas getNumeroCuotas() {
        return numeroCuotas;
    }
}
