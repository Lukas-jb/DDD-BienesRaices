package co.com.sofka.BienesRaices.comercial.command;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.comercial.value.IdVenta;
import co.com.sofka.BienesRaices.comercial.value.ValorTotal;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleContado;
import co.com.sofka.domain.generic.Command;

public class CrearFacturaContado extends Command {
    private IdComercial idComercial;
    private IdVenta entityId;
    private IdInmuebleContado inmuebleContado;
    private IdVendedor idVendedor;
    private ValorTotal valorTotal;
    private IdCliente idCliente;

    public void CrearFacturaContado(IdComercial idComercial, IdVenta entityId, IdInmuebleContado inmuebleContado, IdVendedor idVendedor, ValorTotal valorTotal, IdCliente idCliente) {
        this.idComercial = idComercial;
        this.entityId = entityId;
        this.inmuebleContado = inmuebleContado;
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

    public IdInmuebleContado getInmuebleContado() {
        return inmuebleContado;
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
