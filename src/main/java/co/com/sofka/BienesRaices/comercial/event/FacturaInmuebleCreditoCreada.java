package co.com.sofka.BienesRaices.comercial.event;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.comercial.value.IdVenta;
import co.com.sofka.BienesRaices.comercial.value.ValorTotal;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.inventario.InmuebleCredito;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaInmuebleCreditoCreada extends DomainEvent {
    private final IdVenta entityId;
    private final InmuebleCredito inmuebleCredito;
    private final IdVendedor idVendedor;
    private final ValorTotal valorTotal;
    private final IdCliente idCliente;

    public FacturaInmuebleCreditoCreada(IdVenta entityId, InmuebleCredito inmuebleCredito, IdVendedor idVendedor, ValorTotal valorTotal, IdCliente idCliente) {
        super("sofka.Comercial.FacturaCreditoCreada");
        this.entityId = entityId;
        this.inmuebleCredito = inmuebleCredito;
        this.idVendedor = idVendedor;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
    }

    public IdVenta getEntityId() {
        return entityId;
    }

    public IdVendedor getIdVendedor() {
        return idVendedor;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }
}
