package useCase.empleado;

import co.com.sofka.BienesRaices.empleado.command.CrearEmpleado;
import co.com.sofka.BienesRaices.empleado.event.EmpleadoCreado;
import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Zona;
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