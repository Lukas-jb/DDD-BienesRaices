package co.com.sofka.BienesRaices.comercial;

import co.com.sofka.BienesRaices.comercial.value.*;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.domain.generic.Entity;

public class Venta extends Entity<IdVenta> {

    protected  IdInmueble idInmueble;
    protected  IdVendedor idVendedor;
    protected  IdCliente idCliente;
    protected  ValorTotal valorTotal;


    public Venta(IdVenta entityId, IdInmueble idInmueble, IdVendedor idVendedor, IdCliente idCliente, ValorTotal valorTotal) {
        super(entityId);
        this.idInmueble = idInmueble;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.valorTotal = valorTotal;
    }

    public IdInmueble IdInmueble() {
        return idInmueble;
    }

    public IdVendedor IdVendedor() {
        return idVendedor;
    }

    public IdCliente IdCliente() {
        return idCliente;
    }

    public ValorTotal ValorTotal() {
        return valorTotal;
    }
}
