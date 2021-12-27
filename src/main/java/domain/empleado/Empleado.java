package domain.empleado;

import domain.empleado.event.*;
import domain.empleado.value.IdAsesorCredito;
import domain.empleado.value.IdEmpleado;
import domain.empleado.value.IdGerente;
import domain.empleado.value.IdVendedor;
import domain.generic.Nombre;
import domain.generic.Telefono;
import domain.generic.Zona;
import domain.inventario.Inventario;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Empleado extends AggregateEvent<IdEmpleado> {

    protected Zona zona;
    protected Set<Vendedor> vendedores;
    protected Gerente gerente;
    protected AsesorCredito asesorCredito;

    public Empleado(IdEmpleado entityId, Zona zona) {
        super(entityId);
        this.zona = Objects.requireNonNull(zona);
        appendChange(new EmpleadoCreado(entityId, zona)).apply();
    }

    private Empleado (IdEmpleado entityId){
        super(entityId);
        subscribe(new EmpleadoChange(this));
    }

    public static Empleado from(IdEmpleado idEmpleado, List<DomainEvent> events) {
        var empleado = new Empleado(idEmpleado);
        events.forEach(empleado::applyEvent);
        return empleado;
    }

    public void ActualizarNombreVendedor(IdVendedor entityId, Nombre nombre) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);

        appendChange(new NombreVendedorActualizado(entityId, nombre));
    }

    public void ActualizarTelefonoVendedor(IdVendedor entityId, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(telefono);

        appendChange(new TelefonoVendedorActualizado(entityId, telefono));
    }

    public void ActualizarNombreGerente(IdGerente entityId, Nombre nombre) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);

        appendChange(new NombreGerenteActualizado(entityId, nombre));
    }

    public void ActualizarTelefonoGerente(IdGerente entityId, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(telefono);

        appendChange(new TelefonoGerenteActualizado(entityId, telefono));
    }

    public void AgregarVendedor(IdVendedor entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new VendedorAgregado(entityId, nombre, telefono));
    }

    public void AgregarAsesorCredito(IdAsesorCredito entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new AsesorCreditoAgregado(entityId, nombre, telefono));
    }

    public void AgregarGerente(IdGerente entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new GerenteAgregado(entityId, nombre, telefono));
    }

    public void ActualizarTelefonoAsesorCredito(IdAsesorCredito entityId, Nombre nombre) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);

        appendChange(new TelefonoAsesorCreditoActualizado(entityId, nombre));

    }

    public Optional<Vendedor> getIdVendedorporID(IdVendedor idVendedor){
        return  vendedores.stream()
                .filter(id -> id.equals(idVendedor)).findFirst();
    }

    public Zona getZona() {
        return zona;
    }

    public Set<Vendedor> getVendedo() {
        return vendedores;
    }
}
