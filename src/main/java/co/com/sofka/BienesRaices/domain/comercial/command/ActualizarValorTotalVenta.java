package co.com.sofka.BienesRaices.domain.comercial.command;

import co.com.sofka.BienesRaices.domain.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.domain.comercial.value.IdVenta;
import co.com.sofka.BienesRaices.domain.comercial.value.ValorTotal;
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
