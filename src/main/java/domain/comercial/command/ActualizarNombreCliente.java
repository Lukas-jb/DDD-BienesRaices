package domain.comercial.command;

import domain.comercial.value.IdCliente;
import domain.comercial.value.IdComercial;
import domain.generic.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreCliente extends Command {
    private IdComercial idComercial;
    private IdCliente entityId;
    private Nombre nombre;

    public void ActualizarNombreCliente(IdComercial idComercial, IdCliente entityId, Nombre nombre) {
        this.idComercial = idComercial;
        this.entityId = entityId;
        this.nombre = nombre;
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
}
