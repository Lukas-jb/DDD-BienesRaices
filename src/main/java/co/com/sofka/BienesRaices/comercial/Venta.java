package co.com.sofka.BienesRaices.comercial;

import co.com.sofka.BienesRaices.comercial.value.*;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.domain.generic.Entity;

public class Venta extends Entity<IdVenta> {

    private final IdInmueble idInmueble;
    protected final IdVendedor idVendedor;
    protected final IdCliente idCliente;
    protected final Compraventa compraventa;
    protected final ValorTotal valorTotal;


    public Venta(IdVenta entityId, IdInmueble idInmueble, IdVendedor idVendedor, IdCliente idCliente, Compraventa compraventa, ValorTotal valorTotal) {
        super(entityId);
        this.idInmueble = idInmueble;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.compraventa = compraventa;
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

    public Compraventa Compraventa() {
        return compraventa;
    }

    public ValorTotal ValorTotal() {
        return valorTotal;
    }
}
