package co.com.sofka.BienesRaices.domain.comercial.command;

import co.com.sofka.BienesRaices.domain.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.domain.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
import co.com.sofka.domain.generic.Command;

public class AgregarCliente extends Command {

    protected IdComercial idComercial;
    protected IdCliente entityId;
    protected Nombre nombre;
    protected Telefono telefono;

    public AgregarCliente(IdComercial idComercial, IdCliente entityId, Nombre nombre, Telefono telefono) {
        this.idComercial = idComercial;
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdComercial getIdComercial() {
        return idComercial;
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
