package co.com.sofka.BienesRaices.comercial.command;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.comercial.value.IdVenta;
import co.com.sofka.BienesRaices.comercial.value.ValorTotal;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleSobrePlanos;
import co.com.sofka.domain.generic.Command;

public class CrearFacturaInmuebleSobreplanos extends Command {
    private IdComercial idComercial;
    private IdVenta entityId;
    private IdInmuebleSobrePlanos idInmuebleSobrePlanos;
    private IdVendedor idVendedor;
    private ValorTotal valorTotal;
    private IdCliente idCliente;

    public void CrearFacturaInmuebleSobreplanos(IdComercial idComercial, IdVenta entityId, IdInmuebleSobrePlanos idInmuebleSobrePlanos, IdVendedor idVendedor, ValorTotal valorTotal, IdCliente idCliente) {

        this.idComercial = idComercial;
        this.entityId = entityId;
        this.idInmuebleSobrePlanos = idInmuebleSobrePlanos;
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
