package co.com.sofka.BienesRaices.empleado;

import co.com.sofka.BienesRaices.empleado.value.IdGerente;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.Entity;

public class Gerente extends Entity<IdGerente> {

    private final Nombre Nombre;
    private final Telefono telefono;

    public Gerente(IdGerente entityId, co.com.sofka.BienesRaices.generic.Nombre nombre, Telefono telefono) {
        super(entityId);
        this.Nombre = nombre;
        this.telefono = telefono;
    }

    public Nombre Nombre() {
        return Nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
