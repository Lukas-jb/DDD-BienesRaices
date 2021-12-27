package co.com.sofka.BienesRaices.useCase.empleado;

import co.com.sofka.BienesRaices.domain.empleado.command.CrearEmpleado;
import co.com.sofka.BienesRaices.domain.empleado.event.EmpleadoCreado;
import co.com.sofka.BienesRaices.domain.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.domain.generic.Zona;
import co.com.sofka.BienesRaices.useCase.empleado.CrearEmpleadoUseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearEmpleadoUseCaseTest {

    @Test
    void crearEmpleadoUseCaseTest(){

//arranque
        IdEmpleado idEmpleado= IdEmpleado.of("XXX");
        Zona zona = new Zona(Zona.Valor.NORTE);

        var command = new CrearEmpleado(idEmpleado,zona);
        var useCase = new CrearEmpleadoUseCase();

//actuacion
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new  RequestCommand<>(command))
                .orElseThrow();

//afirmar
        EmpleadoCreado event = (EmpleadoCreado)events.getDomainEvents().get(0);
        Assertions.assertEquals("XXX",event.aggregateRootId());
        Assertions.assertEquals(Zona.Valor.NORTE,event.getZona().value());


    }

}