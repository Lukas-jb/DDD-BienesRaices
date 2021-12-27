package co.com.sofka.BienesRaices.useCase.empleado;

import co.com.sofka.BienesRaices.domain.empleado.Empleado;
import co.com.sofka.BienesRaices.domain.empleado.command.ActualizarNombreGerente;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarNombreGerenteUseCase extends UseCase<RequestCommand<ActualizarNombreGerente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreGerente> actualizarNombreGerenteRequestCommand) {
        var command = actualizarNombreGerenteRequestCommand.getCommand();

        Empleado empleado;
        empleado = Empleado.from(command.getIdEmpleado(), retrieveEvents());
        empleado.ActualizarNombreGerente(command.getEntityId(),command.getNombre());

        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));

    }
}
