package co.com.sofka.BienesRaices.useCase.empleado;

import co.com.sofka.BienesRaices.domain.empleado.command.ActualizarNombreGerente;
import co.com.sofka.BienesRaices.domain.empleado.event.EmpleadoCreado;
import co.com.sofka.BienesRaices.domain.empleado.event.GerenteAgregado;
import co.com.sofka.BienesRaices.domain.empleado.event.NombreGerenteActualizado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdGerente;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
import co.com.sofka.BienesRaices.domain.generic.Zona;
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
class ActualizarNombreGerenteUseCaseTest {
    @Mock
    DomainEventRepository repository;


    @Test
    void actualizarNombreGerenteUseCaseTest() {

        //arranque
        IdEmpleado idEmpleado = IdEmpleado.of("XXXX");
        IdGerente idGerente = IdGerente.of("YYYY");

        var command = new ActualizarNombreGerente(idEmpleado, idGerente, new Nombre("Napoleon"));
        var useCase = new ActualizarNombreGerenteUseCase();

        //actuador
        when(repository.getEventsBy("XXXX")).thenReturn(eventList());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("XXXX")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        //afirmar

        var event = (NombreGerenteActualizado) events.getDomainEvents().get(0);
        Assertions.assertEquals("YYYY", event.getEntityId().value());
        Assertions.assertEquals("Napoleon", event.getNombre().value());
        Mockito.verify(repository).getEventsBy("XXXX");



    }

    private List<DomainEvent> eventList() {
        return List.of(new EmpleadoCreado(
                        IdEmpleado.of("XXXX"),
                        new Zona(Zona.Valor.NORTE)),
                new GerenteAgregado(IdGerente.of("YYYY"),
                        new Nombre("Margarita Pimpinela"),
                        new Telefono("3104567189"))
        );

    }

}