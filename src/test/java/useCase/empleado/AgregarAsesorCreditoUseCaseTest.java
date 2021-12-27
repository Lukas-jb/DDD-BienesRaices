package useCase.empleado;

import co.com.sofka.BienesRaices.empleado.command.AgregarAsesorCredito;
import co.com.sofka.BienesRaices.empleado.event.AsesorCreditoAgregado;
import co.com.sofka.BienesRaices.empleado.event.EmpleadoCreado;
import co.com.sofka.BienesRaices.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.BienesRaices.inventario.event.InventarioCreado;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarAsesorCreditoUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void agregarAsesorCreditoUseCaseTest() {

//arranque
        IdEmpleado idEmpleado = IdEmpleado.of("QQQQ");
        IdAsesorCredito idAsesorCredito = new IdAsesorCredito();
        Nombre nombre = new Nombre("Checo Perez");
        Telefono telefono = new Telefono("3051655749");

        var command = new AgregarAsesorCredito(idEmpleado, idAsesorCredito, nombre, telefono);
        var useCase = new AgregarAsesorCreditoUseCase();

//actuador
        when(repository.getEventsBy("QQQQ")).thenReturn(eventList());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("QQQQ")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

//afirmar
        var event = (AsesorCreditoAgregado) events.getDomainEvents().get(0);
        assertEquals("Checo Perez", event.getNombre().value());
        assertEquals("3051655749", event.getTelefono().value());
        Mockito.verify(repository).getEventsBy("QQQQ");

    }

    private List<DomainEvent> eventList() {
        return List.of(new EmpleadoCreado(
                IdEmpleado.of("xx"),
                new Zona(Zona.Valor.NORTE)
        ));

    }
}