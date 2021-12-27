package domain.empleado;

import domain.empleado.value.IdVendedor;
import domain.generic.Nombre;
import domain.generic.Telefono;
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
