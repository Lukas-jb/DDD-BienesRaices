package domain.comercial.command;

import domain.comercial.value.IdComercial;
import domain.comercial.value.IdSalaVentas;
import domain.generic.Ubicacion;
import co.com.sofka.domain.generic.Command;

public class CrearSalaVentas extends Command {
    private IdComercial comercial;
    private IdSalaVentas entityId;
    private Ubicacion ubicacion;

    public void crearSalaVentas(IdComercial comercial, IdSalaVentas entityId, Ubicacion ubicacion) {
        this.comercial = comercial;
        this.entityId = entityId;
        this.ubicacion = ubicacion;
    }

    public IdComercial getComercial() {
        return comercial;
    }

    public IdSalaVentas getEntityId() {
        return entityId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
