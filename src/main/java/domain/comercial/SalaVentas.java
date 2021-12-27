package domain.comercial;

import domain.comercial.value.IdSalaVentas;
import domain.generic.Ubicacion;
import co.com.sofka.domain.generic.Entity;

public class SalaVentas extends Entity<IdSalaVentas> {

    protected Ubicacion ubicacion;

    public SalaVentas(IdSalaVentas entityId, Ubicacion ubicacion) {
        super(entityId);
        this.ubicacion = ubicacion;
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }
}
