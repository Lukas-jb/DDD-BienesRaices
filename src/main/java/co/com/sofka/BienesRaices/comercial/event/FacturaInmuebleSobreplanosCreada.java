package co.com.sofka.BienesRaices.comercial.event;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.comercial.value.IdVenta;
import co.com.sofka.BienesRaices.comercial.value.ValorTotal;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleSobrePlanos;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaInmuebleSobreplanosCreada extends DomainEvent {
    private final IdVenta entityId;
    private final IdInmuebleSobrePlanos idInmuebleSobrePlanos;
    private final IdVendedor idVendedor;
    private final ValorTotal valorTotal;
    private final IdCliente idCliente;

    public FacturaInmuebleSobreplanosCreada(IdVenta entityId, IdInmuebleSobrePlanos idInmuebleSobrePlanos, IdVendedor idVendedor, ValorTotal valorTotal, IdCliente idCliente) {
        super("sofka.Comercial.FacturaInmuebleSobreplanosCreada");

        this.entityId = entityId;
        this.idInmuebleSobrePlanos = idInmuebleSobrePlanos;
        this.idVendedor = idVendedor;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
    }

    public IdVenta getEntityId() {
        return entityId;
    }

    public IdInmuebleSobrePlanos getIdInmuebleSobrePlanos() {
        return idInmuebleSobrePlanos;
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
