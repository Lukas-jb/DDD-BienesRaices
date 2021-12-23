package co.com.sofka.BienesRaices.empleado;

import co.com.sofka.BienesRaices.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.domain.generic.Entity;

public class AsesorCredito extends Entity<IdAsesorCredito> {

    private final Nombre Nombre;
    private final Telefono telefono;

    public AsesorCredito(IdAsesorCredito entityId, co.com.sofka.BienesRaices.generic.Nombre nombre, Telefono telefono) {
        super(entityId);
        this.Nombre = nombre;
        this.telefono = telefono;
    }

    public Nombre Nombre() {
        return Nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
