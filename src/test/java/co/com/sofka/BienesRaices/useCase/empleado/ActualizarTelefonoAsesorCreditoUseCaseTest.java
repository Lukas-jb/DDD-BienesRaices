package co.com.sofka.BienesRaices.useCase.empleado;

import co.com.sofka.BienesRaices.domain.comercial.Comercial;
import co.com.sofka.BienesRaices.domain.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.domain.empleado.command.ActualizarTelefonoAsesorCredito;
import co.com.sofka.BienesRaices.domain.empleado.event.AsesorCreditoAgregado;
import co.com.sofka.BienesRaices.domain.empleado.event.EmpleadoCreado;
import co.com.sofka.BienesRaices.domain.empleado.event.TelefonoAsesorCreditoActualizado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
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
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ActualizarTelefonoAsesorCreditoUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void ActualizarTelefonoAsesorCreditoUseCaseTest() {

        //arranque
        IdEmpleado idEmpleado = IdEmpleado.of("OOOO");
        IdAsesorCredito idAsesorCredito = IdAsesorCredito.of("12020");

        var command = new ActualizarTelefonoAsesorCredito(idEmpleado, idAsesorCredito, new Telefono("3016505714"));

        var useCase = new ActualizarTelefonoAsesorCreditoUseCase();

        //actuador
        when(repository.getEventsBy("OOOO")).thenReturn(eventList());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("OOOO")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        //afirmar
        var event = (TelefonoAsesorCreditoActualizado) events.getDomainEvents().get(0);
        Assertions.assertEquals("12020", event.getEntityId().value());
        Assertions.assertEquals("3016505714", event.getTelefono().value());
        Mockito.verify(repository).getEventsBy("OOOO");

    }

    private List<DomainEvent> eventList() {
        return List.of(new EmpleadoCreado(IdEmpleado.of("xx"),
                new Zona(Zona.Valor.NORTE),
                new AsesorCreditoAgregado(IdAsesorCredito.of("12020"),new Nombre("Pablo"),new Telefono("4952586"))));
    }


}