package domain.comercial.command;

import domain.comercial.value.IdComercial;
import domain.comercial.value.IdVenta;
import domain.comercial.value.ValorTotal;
import co.com.sofka.domain.generic.Command;

public class ActualizarValorTotalVenta extends Command {
    private IdComercial idComercial;
    private IdVenta entityId;
    private ValorTotal valorTotal;

    public void ActualizarValorTotalVenta(IdComercial idComercial, IdVenta entityId, ValorTotal valorTotal) {
        this.idComercial = idComercial;
        this.entityId = entityId;
        this.valorTotal = valorTotal;
    }

    public IdComercial getIdComercial() {
        return idComercial;
    }

    public IdVenta getEntityId() {
        return entityId;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }
}
