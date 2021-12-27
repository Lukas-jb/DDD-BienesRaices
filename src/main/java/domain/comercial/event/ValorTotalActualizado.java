package domain.comercial.event;

import domain.comercial.value.IdVenta;
import domain.comercial.value.ValorTotal;
import co.com.sofka.domain.generic.DomainEvent;

public class ValorTotalActualizado extends DomainEvent {
    private final IdVenta entityId;
    private final ValorTotal valorTotal;

    public ValorTotalActualizado(IdVenta entityId, ValorTotal valorTotal) {
        super("sofka.Comercial.ValorTotalActualizado");
        this.entityId = entityId;
        this.valorTotal = valorTotal;
    }

    public IdVenta getEntityId() {
        return entityId;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }
}
