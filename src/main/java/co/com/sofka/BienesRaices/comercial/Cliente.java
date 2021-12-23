package co.com.sofka.BienesRaices.comercial;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<IdCliente> {

    private final Nombre nombre;
    private  final Telefono telefono;

    public Cliente(IdCliente entityId, Nombre nombre, Telefono telefono) {
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
