package co.com.sofka.BienesRaices.comercial.command;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.Command;

public class CrearCliente extends Command {

    private IdComercial comercial;
    private IdCliente entityId;
    private Nombre nombre;
    private Telefono telefono;

    public void crearCliente(IdComercial comercial, IdCliente entityId, Nombre nombre, Telefono telefono) {
        this.comercial = comercial;
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdComercial getComercial() {
        return comercial;
    }

    public IdCliente getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
