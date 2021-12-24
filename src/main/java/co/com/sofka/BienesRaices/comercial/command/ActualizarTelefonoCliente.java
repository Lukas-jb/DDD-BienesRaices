package co.com.sofka.BienesRaices.comercial.command;

import co.com.sofka.BienesRaices.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.generic.Telefono;
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
