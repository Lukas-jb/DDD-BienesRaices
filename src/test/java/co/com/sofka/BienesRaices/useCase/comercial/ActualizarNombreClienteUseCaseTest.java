package co.com.sofka.BienesRaices.useCase.comercial;

import co.com.sofka.BienesRaices.domain.comercial.Comercial;
import co.com.sofka.BienesRaices.domain.comercial.command.ActualizarNombreCliente;
import co.com.sofka.BienesRaices.domain.comercial.event.ComercialCreado;
import co.com.sofka.BienesRaices.domain.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.domain.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.domain.empleado.event.EmpleadoCreado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ActualizarNombreClienteUseCaseTest {
    @Mock
    MockitoExtension repository;

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
       /* when(repository.getEventsBy("XXXX")).thenReturn(eventList());

        //afirmar


    }

    private List<DomainEvent> eventList() {
        return List.of(new ComercialCreado(IdComercial.of("XXXX")))
    }
*/
    }
}