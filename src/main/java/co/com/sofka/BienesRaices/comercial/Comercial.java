package co.com.sofka.BienesRaices.comercial;

import co.com.sofka.BienesRaices.comercial.event.ComercialCreado;
import co.com.sofka.BienesRaices.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.event.InventarioCreado;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;

import javax.xml.stream.events.StartElement;
import java.util.Set;


public class Comercial extends AggregateEvent<IdComercial> {

    protected Ubicacion ubicacion;
    protected Telefono telefono;
    protected Set<IdInventario> IdInventario;

    public Comercial(IdComercial entityId) {
        super(entityId);
        this.telefono = telefono;
        this.ubicacion= ubicacion;
        appendChange(new ComercialCreado(entityId, telefono,ubicacion)).apply();

    }
}
