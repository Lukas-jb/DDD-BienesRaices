package co.com.sofka.BienesRaices.comercial.command;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.comercial.value.IdVenta;
import co.com.sofka.BienesRaices.comercial.value.ValorTotal;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.inventario.InmuebleCredito;
import co.com.sofka.domain.generic.Command;

public class CrearFacturaCredito extends Command {
    private IdComercial idComercial;
    private IdVenta entityId;
    private InmuebleCredito inmuebleCredito;
    private IdVendedor idVendedor;
    private ValorTotal valorTotal;
    private IdCliente idCliente;

    public void CrearFacturaCredito(IdComercial idComercial, IdVenta entityId, InmuebleCredito inmuebleCredito, IdVendedor idVendedor, ValorTotal valorTotal, IdCliente idCliente) {
        this.idComercial = idComercial;
        this.entityId = entityId;
        this.inmuebleCredito = inmuebleCredito;
        this.idVendedor = idVendedor;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
    }

    public IdComercial getIdComercial() {
        return idComercial;
    }

    public IdVenta getEntityId() {
        return entityId;
    }

    public InmuebleCredito getInmuebleCredito() {
        return inmuebleCredito;
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
