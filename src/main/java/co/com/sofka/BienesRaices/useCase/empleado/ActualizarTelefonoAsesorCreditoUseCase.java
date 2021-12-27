package co.com.sofka.BienesRaices.useCase.empleado;

import co.com.sofka.BienesRaices.domain.empleado.Empleado;
import co.com.sofka.BienesRaices.domain.empleado.command.ActualizarTelefonoAsesorCredito;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarTelefonoAsesorCreditoUseCase extends UseCase<RequestCommand<ActualizarTelefonoAsesorCredito>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarTelefonoAsesorCredito> actualizarTelefonoAsesorCreditoRequestCommand) {

        var command = actualizarTelefonoAsesorCreditoRequestCommand.getCommand();

        Empleado empleado;

        empleado = Empleado.from(command.getIdIdEmpleado(), retrieveEvents());

        empleado.ActualizarTelefonoAsesorCredito(command.getEntityId(),
                command.getTelefono());

        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));

    }
}
