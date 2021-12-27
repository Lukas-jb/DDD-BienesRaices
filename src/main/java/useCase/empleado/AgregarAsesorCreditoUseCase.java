package useCase.empleado;

import co.com.sofka.BienesRaices.empleado.Empleado;
import co.com.sofka.BienesRaices.empleado.command.AgregarAsesorCredito;
import co.com.sofka.BienesRaices.empleado.value.IdAsesorCredito;
import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.BienesRaices.inventario.Inventario;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import static co.com.sofka.BienesRaices.empleado.Empleado.from;

public class AgregarAsesorCreditoUseCase extends UseCase<RequestCommand<AgregarAsesorCredito>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarAsesorCredito> agregarAsesorCreditoRequestCommand) {

        var command = agregarAsesorCreditoRequestCommand.getCommand();

        Empleado empleado;
        empleado = Empleado.from(command.getIdEmpleado(), retrieveEvents());

        empleado.AgregarAsesorCredito(
                command.getEntityId(),
                command.getNombre(),
                command.getTelefono()
        );
        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));

    }
}

