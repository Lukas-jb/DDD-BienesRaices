package co.com.sofka.BienesRaices.comercial.event;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.comercial.value.IdVenta;
import co.com.sofka.BienesRaices.comercial.value.ValorTotal;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleContado;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaContadoCreada extends DomainEvent {
    private final IdVenta entityId;
    private final IdInmuebleContado inmuebleContado;
    private final IdVendedor idVendedor;
    private final ValorTotal valorTotal;
    private final IdCliente idCliente;


    public FacturaContadoCreada(IdVenta entityId, IdInmuebleContado inmuebleContado, IdVendedor idVendedor, ValorTotal valorTotal, IdCliente idCliente) {
        super("sofka.Comercial.FacturaContadoCreada");

        this.entityId = entityId;
        this.inmuebleContado = inmuebleContado;
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

    public IdInmuebleContado getInmuebleContado() {
        return inmuebleContado;
    }
}
