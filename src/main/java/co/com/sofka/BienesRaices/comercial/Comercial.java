package co.com.sofka.BienesRaices.comercial;

import co.com.sofka.BienesRaices.comercial.event.*;
import co.com.sofka.BienesRaices.comercial.value.*;
import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.*;


public class Comercial extends AggregateEvent<IdComercial> {

    protected Ubicacion ubicacion;
    protected Telefono telefono;
    protected Set<IdInventario> IdInventarios;
    protected Venta venta;
    protected SalaVentas salaVentas;
    protected Cliente cliente;
    protected IdEmpleado idEmpleado;

    public Comercial(IdComercial entityId, Telefono telefono, Ubicacion ubicacion) {
        super(entityId);
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        appendChange(new ComercialCreado(entityId, telefono, ubicacion)).apply();
    }

    public Comercial(IdComercial entityId) {
        super(entityId);
        subscribe(new ComercialChange(this));
    }

    public static Comercial from(IdComercial entityId, List<DomainEvent> events){
        var comercial = new Comercial(entityId);
        events.forEach(comercial::applyEvent);
        return comercial;
    }

    public void agregarCliente(IdCliente entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new ClienteAgregado(entityId, nombre, telefono));

    }

    public void crearSalaVentas(IdSalaVentas entityId,Ubicacion ubicacion) {
        Objects.nonNull(entityId);
        Objects.nonNull(ubicacion);
        appendChange(new SalaVentasCreada(entityId, ubicacion));

    }

    public void actualizarUbicacionSalaVentas(IdInmuebleContado entityId, Ubicacion ubicacion) {
        Objects.nonNull(entityId);
        Objects.nonNull(ubicacion);
        appendChange(new UbicacionSalaventasActualizada(entityId, ubicacion));
    }

    public void actualizarTelefonoCliente(IdCliente entityId, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(telefono);
        appendChange(new TelefonoClienteActualizado(entityId, telefono));
    }

    public void actualizarNombreCliente(IdCliente entityId, Nombre nombre) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        appendChange(new NombreClienteActualizado(entityId, nombre));
    }

    public void actualizarValorTotalVenta(IdVenta entityId, ValorTotal valorTotal) {
        Objects.nonNull(entityId);
        Objects.nonNull(valorTotal);
        appendChange(new ValorTotalActualizado(entityId, valorTotal));
    }

    public Optional<IdInventario> getIdInventarioPorID(IdInventario idInventario) {
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
