package co.com.sofka.BienesRaices.empleado;

import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Vendedor extends Entity<IdVendedor> {

    private  Nombre nombre;
    private  Telefono telefono;

    public Vendedor(IdVendedor entityId, Telefono telefono, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void ActualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void ActualizarTelefono(Telefono telefono) {
        this.telefono = Objects.requireNonNull(telefono);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
