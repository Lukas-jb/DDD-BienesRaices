package co.com.sofka.BienesRaices.comercial;

import co.com.sofka.BienesRaices.comercial.value.IdSalaVentas;
import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.domain.generic.Entity;

public class SalaVentas extends Entity<IdSalaVentas> {

    private final Ubicacion ubicacion;

    public SalaVentas(IdSalaVentas entityId, Ubicacion ubicacion) {
        super(entityId);
        this.ubicacion = ubicacion;
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }
}
