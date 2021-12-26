package useCase.empleado;

import co.com.sofka.BienesRaices.empleado.command.AgregarAsesorCredito;
import co.com.sofka.BienesRaices.empleado.event.AsesorCreditoAgregado;
import co.com.sofka.BienesRaices.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Nombre;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import useCase.Inventario.AgregarInmuebleContadoUseCase;

import static org.junit.jupiter.api.Assertions.*;

class AgregarAsesorCreditoUseCaseTest {
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
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

//afirmar
        var event = (AsesorCreditoAgregado) events.getDomainEvents().get(1);
        Assertions.assertEquals("Checo Perez",event.getNombre().value());
        Assertions.assertEquals("3051655749",event.getTelefono().value());

    }


}