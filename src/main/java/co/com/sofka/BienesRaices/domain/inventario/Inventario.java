package co.com.sofka.BienesRaices.domain.inventario;

import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.generic.Zona;
import co.com.sofka.BienesRaices.domain.inventario.event.*;
import co.com.sofka.BienesRaices.domain.inventario.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class    Inventario extends AggregateEvent<IdInventario> {
    protected Zona zona;
    protected Set<InmuebleSobrePlanos> inmueblesSobrePlanos;
    protected Set<InmuebleCredito> inmueblesCredito;
    protected Set<InmuebleContado> inmueblesContado;

    public Inventario(IdInventario entityId, Zona zona) {
        super(entityId);
        this.zona = Objects.requireNonNull(zona);
        appendChange(new InventarioCreado(entityId, zona)).apply();
    }

    public Inventario(IdInventario entityId) {
        super(entityId);
        subscribe(new InventarioChange(this));
    }

    public static Inventario from(IdInventario idInventario, List<DomainEvent> events) {
        var inventario = new Inventario(idInventario);
        events.forEach(inventario::applyEvent);
        return inventario;
    }


    public void agregarInmuebleContado(IdInmuebleContado entityId, Ubicacion ubicacion, Tamano tamano, Precio precio) {
        Objects.nonNull(entityId);
        Objects.nonNull(ubicacion);
        Objects.nonNull(tamano);
        Objects.nonNull(precio);
        appendChange(new InmuebleContadoAgregado(entityId, ubicacion, tamano, precio));
    }

    public void agregarInmueblrCredito(IdInmuebleCredito entityId, Ubicacion ubicacion, Tamano tamano, Precio precio, CuotaInicial cuotaInicial, NumeroCuotas numeroCuotas) {
        Objects.nonNull(entityId);
        Objects.nonNull(ubicacion);
        Objects.nonNull(tamano);
        Objects.nonNull(precio);
        Objects.nonNull(cuotaInicial);
        Objects.nonNull(cuotaInicial);
        appendChange(new InmuebleCreditoAgregado(entityId, ubicacion, tamano, precio, cuotaInicial, numeroCuotas));

    }

    public void agregarInmuebleSobrePlanos(IdInmuebleSobrePlanos entityId, Ubicacion ubicacion, Tamano tamano, Diseno diseno, Precio precio) {
        Objects.nonNull(entityId);
        Objects.nonNull(ubicacion);
        Objects.nonNull(tamano);
        Objects.nonNull(precio);
        Objects.nonNull(diseno);
        Objects.nonNull(precio);

        appendChange(new InmuebleSobrePlanosAgregado(entityId, ubicacion, tamano, diseno, precio));

    }

    public void actualizarPrecioInmueblrContado(IdInmuebleContado entityId, Precio precio) {
        Objects.nonNull(entityId);
        Objects.nonNull(precio);
        appendChange(new PrecioInmuebleContadoActualizado(entityId, precio));
    }

    public void actualizarPrecioInmueblrSobrePlanos(IdInmuebleSobrePlanos entityId, Precio precio) {
        Objects.nonNull(entityId);
        Objects.nonNull(precio);
        appendChange(new PrecionInmuebleSobrePlanosActualizado(entityId, precio));

    }

    public void actualizarNumeroCuotasInmueblesCredito(IdInmuebleCredito entityId, NumeroCuotas numeroCuotas) {
        Objects.nonNull(entityId);
        Objects.nonNull(numeroCuotas);
        appendChange(new NumeroCuotasInmuebleCreditoActualizado(entityId, numeroCuotas));
    }


    public Optional<InmuebleSobrePlanos> getInmuebleSobrePlanosID(IdInmuebleSobrePlanos idInmuebleSobrePlanos) {
        return inmueblesSobrePlanos
                .stream()
                .filter(inmuebleSobrePlanos -> inmuebleSobrePlanos.identity().equals(idInmuebleSobrePlanos)).findFirst();
    }

    public Optional<InmuebleContado> getInmueblesContadoID(IdInmuebleContado idInmuebleContado) {
        return inmueblesContado
                .stream()
                .filter(inmuebleContado -> inmuebleContado.identity().equals(idInmuebleContado)).findFirst();
    }

    public Optional<InmuebleCredito> getInmueblesCreditoID(IdInmuebleCredito idInmuebleCredito) {
        return inmueblesCredito
                .stream()
                .filter(inmuebleCredito -> inmuebleCredito.identity().equals(idInmuebleCredito)).findFirst();
    }


    public Zona getZona() {
        return zona;
    }

    public Set<InmuebleSobrePlanos> inmueblesSobrePlanos() {
        return inmueblesSobrePlanos;
    }

    public Set<InmuebleCredito> inmueblesCredito() {
        return inmueblesCredito;
    }

    public Set<InmuebleContado> inmueblesContado() {
        return inmueblesContado;
    }


}
