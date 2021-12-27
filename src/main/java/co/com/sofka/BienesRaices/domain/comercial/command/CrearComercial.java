package co.com.sofka.BienesRaices.domain.comercial.command;

import co.com.sofka.BienesRaices.domain.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.domain.generic.Command;

public class CrearComercial extends Command {

    private final IdComercial entityId;
    private final Telefono telefono;
    private final Ubicacion ubicacion;

    public CrearComercial(IdComercial entityId, Telefono telefono, Ubicacion ubicacion) {
        this.entityId = entityId;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    public IdComercial getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
