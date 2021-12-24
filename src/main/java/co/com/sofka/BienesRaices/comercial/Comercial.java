package co.com.sofka.BienesRaices.comercial;

import co.com.sofka.BienesRaices.comercial.event.*;
import co.com.sofka.BienesRaices.comercial.value.*;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.InmuebleCredito;
import co.com.sofka.BienesRaices.inventario.Inventario;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleSobrePlanos;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Comercial extends AggregateEvent<IdComercial> {

    protected Ubicacion ubicacion;
    protected Telefono telefono;
    protected Set<IdInventario> IdInventarios;

    public Comercial(IdComercial entityId) {
        super(entityId);
        this.telefono = telefono;
        this.ubicacion= ubicacion;
        appendChange(new ComercialCreado(entityId, telefono,ubicacion)).apply();
    }


    public void ActualizarUbicacionSalaVentas(IdInmuebleContado entityId, Ubicacion ubicacion) {
        Objects.nonNull(entityId);
        Objects.nonNull(ubicacion);
        appendChange(new UbicacionSalaventasActualizada(entityId, ubicacion));
    }

    public void ActualizarTelefonoCliente(IdCliente entityId, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(telefono);
        appendChange(new TelefonoClienteActualizado(entityId, telefono));
    }

    public void ActualizarNombreCliente(IdCliente entityId, Nombre nombre) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        appendChange(new NombreClienteActualizado(entityId, nombre));
    }

    public void ActualizarValorTotalVenta(IdVenta entityId, ValorTotal valorTotal) {
        Objects.nonNull(entityId);
        Objects.nonNull(valorTotal);
        appendChange(new ValorTotalActualizado(entityId, valorTotal));
    }

    public void CrearFacturaContado(IdVenta entityId,IdInmuebleContado inmuebleContado, IdVendedor idVendedor, ValorTotal valorTotal,IdCliente idCliente) {
        Objects.nonNull(entityId);
        Objects.nonNull(idVendedor);
        Objects.nonNull(valorTotal);
        Objects.nonNull(idCliente);
        appendChange(new FacturaInmuebleContadoCreada(entityId,inmuebleContado, idVendedor, valorTotal,idCliente));
    }


    public void CrearFacturaCredito(IdVenta entityId, InmuebleCredito inmuebleCredito, IdVendedor idVendedor, ValorTotal valorTotal, IdCliente idCliente) {
        Objects.nonNull(entityId);
        Objects.nonNull(inmuebleCredito);
        Objects.nonNull(idVendedor);
        Objects.nonNull(valorTotal);
        Objects.nonNull(idCliente);
        appendChange(new FacturaInmuebleCreditoCreada(entityId, inmuebleCredito ,idVendedor, valorTotal,idCliente));
    }

    public void CrearFacturaInmuebleSobreplanos(IdVenta entityId, IdInmuebleSobrePlanos idInmuebleSobrePlanos, IdVendedor idVendedor, ValorTotal valorTotal, IdCliente idCliente) {
        Objects.nonNull(entityId);
        Objects.nonNull(idInmuebleSobrePlanos);
        Objects.nonNull(idVendedor);
        Objects.nonNull(valorTotal);
        Objects.nonNull(idCliente);
        appendChange(new FacturaInmuebleSobreplanosCreada(entityId, idInmuebleSobrePlanos, idVendedor, valorTotal, idCliente));
    }

    public Optional <IdInventario> getIdInventarioPorID(IdInventario idInventario){
        return IdInventarios.stream().filter(id -> id.equals(idInventario)).findFirst();
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Set<IdInventario> IdInventario() {
        return IdInventarios;
    }
}
