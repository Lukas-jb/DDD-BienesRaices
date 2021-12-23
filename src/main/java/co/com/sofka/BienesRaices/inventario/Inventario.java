package co.com.sofka.BienesRaices.inventario;

import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.BienesRaices.inventario.event.*;
import co.com.sofka.BienesRaices.inventario.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;

import java.util.List;
import java.util.Objects;
import java.util.Set;


public class Inventario extends AggregateEvent<IdInventario> {
    protected Zona zona;
    protected Set<InmuebleSobrePlanos> inmuebleSobrePlanos;
    protected Set<InmuebleCredito> InmuebleCredito;
    protected Set<InmuebleContado> inmuebleContados;


    public Inventario(IdInventario entityId, Zona zona) {
        super(entityId);
        this.zona = Objects.requireNonNull(zona);
        appendChange(new InventarioCreado(entityId, zona)).apply();
    }

    public static Inventario from(IdInventario idProfecional, List<DomainEvent> enets) {
        var profesional = new Inventario(idProfecional);
        enets.forEach(profesional::applyEvent);
        return profesional;
    }


    public void AgregarInmuebleContado(IdInmuebleContado entityId, Ubicacion ubicacion, Tamano tamano, Precio precio) {
        Objects.nonNull(entityId);
        Objects.nonNull(ubicacion);
        Objects.nonNull(tamano);
        Objects.nonNull(precio);
        appendChange(new InmuebleContadoCreado(entityId, ubicacion, tamano, precio));
    }

    public void AgregarInmueblrCredito(IdInmuebleCredito entityId, Ubicacion ubicacion, Tamano tamano, Precio precio, CuotaInicial cuotaInicial, NumeroCuotas numeroCuotas) {
        Objects.nonNull(entityId);
        Objects.nonNull(ubicacion);
        Objects.nonNull(tamano);
        Objects.nonNull(precio);
        Objects.nonNull(cuotaInicial);
        Objects.nonNull(cuotaInicial);
        appendChange(new InmuebleCreditoAgregado(entityId, ubicacion, tamano, precio, cuotaInicial, numeroCuotas));

    }
    public void InmuebleSobrePlanosAgregado(Identity entityId, Ubicacion ubicacion, Tamano tamano, Diseno diseno, Precio precio){
        Objects.nonNull(entityId);
        Objects.nonNull(ubicacion);
        Objects.nonNull(tamano);
        Objects.nonNull(precio);
        Objects.nonNull(diseno);
        Objects.nonNull(precio);

        appendChange(new InmuebleSobrePlanosAgregado(entityId, ubicacion, tamano, diseno, precio));

    }
    public void ActualizarPrecioInmueblrContado(Identity entityId,Precio precio) {
        Objects.nonNull(entityId);
        Objects.nonNull(precio);
        appendChange(new PrecionInmuebleContadoActualizado(entityId, precio));
    }
    public void ActualizarPrecioInmueblrSobrePlanos(Identity entityId,Precio precio) {
        Objects.nonNull(entityId);
        Objects.nonNull(precio);
        appendChange(new PrecionInmuebleSobrePlanosActualizado(entityId, precio));

    }
    public void actualizarNumeroCuotasInmueblesCredito(Identity entityId,NumeroCuotas numeroCuotas){
        Objects.nonNull(entityId);
        Objects.nonNull(numeroCuotas);
        appendChange(new NumeroCuotasInmuebleActualizado(entityId,numeroCuotas));
    }


}
