package domain.empleado;

import domain.empleado.value.IdGerente;
import domain.generic.Nombre;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.Entity;

public class Gerente extends Entity<IdGerente> {

    protected  Nombre nombre;
    protected  Telefono telefono;

    public Gerente(IdGerente entityId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
