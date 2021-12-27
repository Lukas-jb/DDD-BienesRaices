package co.com.sofka.BienesRaices.domain.comercial.command;

import co.com.sofka.BienesRaices.domain.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.domain.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreCliente extends Command {
    private IdComercial idComercial;
    private IdCliente entityId;
    private Nombre nombre;

    public ActualizarNombreCliente(IdComercial idComercial, IdCliente entityId, Nombre nombre) {
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
