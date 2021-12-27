package domain.comercial.command;

import domain.comercial.value.IdComercial;
import domain.generic.Telefono;
import domain.generic.Ubicacion;
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
