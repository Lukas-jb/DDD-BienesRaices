package domain.comercial.command;

import domain.comercial.value.IdCliente;
import domain.comercial.value.IdComercial;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.Command;

public class ActualizarTelefonoCliente extends Command {
    private IdComercial idComercial;
    private IdCliente entityId;
    private Telefono telefono;

    public void ActualizarTelefonoCliente(IdComercial idComercial, IdCliente entityId, Telefono telefono) {
        this.idComercial = idComercial;
        this.entityId = entityId;
        this.telefono = telefono;
    }

    public IdComercial getIdComercial() {
        return idComercial;
    }

    public IdCliente getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
