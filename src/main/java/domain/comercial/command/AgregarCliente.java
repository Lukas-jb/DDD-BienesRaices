package domain.comercial.command;

import domain.comercial.value.IdCliente;
import domain.comercial.value.IdComercial;
import domain.generic.Nombre;
import domain.generic.Telefono;
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
