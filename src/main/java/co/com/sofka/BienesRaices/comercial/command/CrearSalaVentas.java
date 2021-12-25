package co.com.sofka.BienesRaices.comercial.command;

import co.com.sofka.BienesRaices.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.comercial.value.IdSalaVentas;
import co.com.sofka.BienesRaices.generic.Ubicacion;
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
