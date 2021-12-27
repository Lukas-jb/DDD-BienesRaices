package co.com.sofka.BienesRaices.useCase.comercial;

import co.com.sofka.BienesRaices.domain.comercial.Comercial;
import co.com.sofka.BienesRaices.domain.comercial.command.ActualizarNombreCliente;
import co.com.sofka.BienesRaices.domain.comercial.event.ClienteAgregado;
import co.com.sofka.BienesRaices.domain.comercial.event.ComercialCreado;
import co.com.sofka.BienesRaices.domain.comercial.event.NombreClienteActualizado;
import co.com.sofka.BienesRaices.domain.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.domain.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.domain.empleado.event.EmpleadoCreado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
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

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ActualizarNombreClienteUseCaseTest {

    @Mock
    DomainEventRepository repository;


    @Test
    void actualizarNombreClienteUseCaseTest() {

        //arranque
        IdComercial idComercial = IdComercial.of("XXXX");
        IdCliente idCliente = IdCliente.of("QQQ");

        var command = new ActualizarNombreCliente(idComercial,
                idCliente,
                new Nombre("Pilar"));

        var useCase = new ActualizarNombreClienteUseCase();

        //actuador
        when(repository.getEventsBy("XXXX")).thenReturn(eventList());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("XXXX")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        //afirmar
        var event = (NombreClienteActualizado) events.getDomainEvents().get(0);
        assertEquals("QQQ", event.getEntityId().value());
        assertEquals("Pilar", event.getNombre().value());



    }

    private List<DomainEvent> eventList() {
        return List.of(new ComercialCreado(IdComercial.of("XXXX"),new Telefono("4972546"),new Ubicacion("calle xx xx xx"),
                new ClienteAgregado(IdCliente.of("QQQ"),new Nombre("Paola"),new Telefono("5555555"))));
    }

}
