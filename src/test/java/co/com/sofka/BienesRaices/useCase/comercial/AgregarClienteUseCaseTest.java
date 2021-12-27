package co.com.sofka.BienesRaices.useCase.comercial;

import co.com.sofka.BienesRaices.domain.comercial.command.AgregarCliente;
import co.com.sofka.BienesRaices.domain.comercial.event.ClienteAgregado;
import co.com.sofka.BienesRaices.domain.comercial.event.ComercialCreado;
import co.com.sofka.BienesRaices.domain.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.domain.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
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
class AgregarClienteUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    void agregarClienteUseCaseTest() {

        //arranque
        IdComercial idComercial = IdComercial.of("XXXX");
        IdCliente idCliente = new IdCliente();
        Nombre nombre = new Nombre("Joaquin");
        Telefono telefono = new Telefono("4440404");


        var command = new AgregarCliente(idComercial, idCliente, nombre, telefono);
        var useCase = new AgregarClienteUseCase();

        //actuador

        when(repository.getEventsBy("XXXX")).thenReturn(eventList());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("XXXX")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        //afirmar

        var event =(ClienteAgregado) events.getDomainEvents().get(0);
        Assertions.assertEquals("Joaquin",event.getNombre().value());
        Assertions.assertEquals("4440404",event.getTelefono().value());
        Mockito.verify(repository).getEventsBy("XXXX");

    }

    private List<DomainEvent> eventList() {
        return List.of(new ComercialCreado(
                IdComercial.of("XXXX"),
                new Telefono("5555555"),
                new Ubicacion("calle con esquina")
        ));
    }

}