package co.com.sofka.BienesRaices.empleado;

import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.Entity;

public class Vendedor extends Entity<IdVendedor> {

    private final Nombre Nombre;
    private final Telefono telefono;

    public Vendedor(IdVendedor entityId, Telefono telefono, Nombre nombre) {
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
