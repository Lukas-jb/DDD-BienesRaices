package co.com.sofka.BienesRaices.empleado.command;

import co.com.sofka.BienesRaices.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.BienesRaices.inventario.Inventario;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.domain.generic.Command;

public class AgregarAsesorCredito extends Command {

    private IdInventario idInventario;
    private IdAsesorCredito entityId;
    private Nombre nombre;
    private Telefono telefono;

    public void AgregarAsesorCredito(IdInventario idInventario , IdAsesorCredito entityId, Nombre nombre, Telefono telefono) {
        this.idInventario = idInventario;
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
