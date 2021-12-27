package domain.empleado;

import domain.empleado.value.IdAsesorCredito;
import domain.generic.Nombre;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.Entity;

public class AsesorCredito extends Entity<IdAsesorCredito> {


    protected Nombre nombre;
    protected Telefono telefono;

    public AsesorCredito(IdAsesorCredito entityId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }
}
