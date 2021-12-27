package co.com.sofka.BienesRaices.useCase.empleado;

import co.com.sofka.BienesRaices.domain.empleado.Empleado;
import co.com.sofka.BienesRaices.domain.empleado.command.AgregarAsesorCredito;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

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

