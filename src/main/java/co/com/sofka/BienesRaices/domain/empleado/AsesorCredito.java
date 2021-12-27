package co.com.sofka.BienesRaices.domain.empleado;

import co.com.sofka.BienesRaices.domain.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
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
