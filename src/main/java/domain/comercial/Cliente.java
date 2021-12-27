package domain.comercial;

import domain.comercial.value.IdCliente;
import domain.generic.Nombre;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<IdCliente> {

    protected  Nombre nombre;
    protected  Telefono telefono;

    public Cliente(IdCliente entityId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }

}
