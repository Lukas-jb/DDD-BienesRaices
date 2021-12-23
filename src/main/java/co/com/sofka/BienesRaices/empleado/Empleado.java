package co.com.sofka.BienesRaices.empleado;

import co.com.sofka.BienesRaices.empleado.event.*;
import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;


public class Empleado extends AggregateEvent<IdEmpleado> {

    protected Zona zona;
    protected Set<Vendedor> vendedo;

    public Empleado(IdEmpleado entityId, Zona zona) {
        super(entityId);
        this.zona = Objects.requireNonNull(zona);
        appendChange(new EmpleadoCreado(entityId, zona)).apply();
    }


    public void ActualizarNombreVendedor(IdEmpleado entityId, Nombre nombre) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);

        appendChange(new NombreVendedorActualizado(entityId, nombre));
    }

    public void ActualizarTelefonoVendedor(IdEmpleado entityId, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(telefono);

        appendChange(new TelefonoVendedorActualizado(entityId, telefono));
    }

    public void ActualizarNombreGerente(IdEmpleado entityId, Nombre nombre) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);

        appendChange(new NombreGerenteActualizado(entityId, nombre));
    }

    public void ActualizarTelefonoGerente(IdEmpleado entityId, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(telefono);

        appendChange(new TelefonoGerenteActualizado(entityId, telefono));
    }

    public void AgregarVendedor(IdEmpleado entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new VendedorAgregado(entityId, nombre, telefono));
    }

    public void AgregarAsesorCredito(IdEmpleado entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new AsesorCreditoAgregado(entityId, nombre, telefono));
    }

    public void AgregarGerente(IdEmpleado entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new GerenteAgregado(entityId, nombre, telefono));
    }

    public void ActualizarTelefonoAsesorCredito(IdEmpleado entityId, Nombre nombre) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);

        appendChange(new TelefonoAsesorCreditoActualizado(entityId, nombre));

    }
}
