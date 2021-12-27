package co.com.sofka.BienesRaices.domain.comercial.command;

import co.com.sofka.BienesRaices.domain.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInmuebleContado;
import co.com.sofka.domain.generic.Command;

public class ActualizarUbicacionSalaVentas extends Command {
    private IdComercial idcomercial;
    private IdInmuebleContado entityId;
    private Ubicacion ubicacion;

    public void ActualizarUbicacionSalaVentas(IdComercial idcomercial, IdInmuebleContado entityId, Ubicacion ubicacion) {

        this.idcomercial = idcomercial;
        this.entityId = entityId;
        this.ubicacion = ubicacion;
    }

    public IdComercial getIdcomercial() {
        return idcomercial;
    }

    public IdInmuebleContado getEntityId() {
        return entityId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
