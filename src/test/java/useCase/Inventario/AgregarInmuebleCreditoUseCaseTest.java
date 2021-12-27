package useCase.Inventario;

import domain.generic.Ubicacion;
import domain.generic.Zona;
import domain.inventario.command.AgregarInmuebleCredito;
import domain.inventario.event.InmuebleCreditoAgregado;
import domain.inventario.event.InventarioCreado;
import domain.inventario.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarInmuebleCreditoUseCaseTest {

    @Mock
    DomainEventRepository repository;


    @Test

    void agregarInmuebleCreditoUseCaseTest(){

//Arranque
        IdInventario idInventario = IdInventario.of("xxxx");
        IdInmuebleCredito idInmuebleCredito = new IdInmuebleCredito();
        Ubicacion ubicacion = new Ubicacion("clle 10 43d 50");
        Tamano tamano = new Tamano(70);
        Precio precio = new Precio(100000000);
        CuotaInicial cuotaInicial= new CuotaInicial(40000000);
        NumeroCuotas numeroCuotas= new NumeroCuotas(60);

        var command = new AgregarInmuebleCredito(idInventario, idInmuebleCredito, ubicacion, tamano, precio, cuotaInicial, numeroCuotas);
        var useCase = new AgregarInmuebleCreditoUseCase();

//actuador
        when(repository.getEventsBy("xxxx")).thenReturn(eventList());
        useCase.addRepository(repository);

        var events =UseCaseHandler.getInstance()
                .setIdentifyExecutor("xxxx")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        /*var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();*/

//afirmar
        var event = (InmuebleCreditoAgregado) events.getDomainEvents().get(0);
        Assertions.assertEquals("clle 10 43d 50", event.getUbicacion().value());
        Assertions.assertEquals(70, event.getTamano().value());
        Assertions.assertEquals(100000000, event.getPrecio().value());
        Assertions.assertEquals(40000000, event.getCuotaInicial().value());
        Assertions.assertEquals(60, event.getNumeroCuotas().value());
        Mockito.verify(repository).getEventsBy("xxxx");


    }

    private List<DomainEvent> eventList(){
        return List.of(new InventarioCreado(IdInventario.of("xxxx"),
                new Zona(Zona.Valor.NORTE)));
    }



}