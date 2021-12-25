package useCase.empleado;

import co.com.sofka.BienesRaices.empleado.Empleado;
import co.com.sofka.BienesRaices.empleado.command.CrearEmpleado;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearEmpleadoUseCase extends UseCase<RequestCommand<CrearEmpleado>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearEmpleado> crearEmpleadoRequestCommand) {
        var command = crearEmpleadoRequestCommand.getCommand();

        Empleado empleado;

        empleado = new Empleado(
                command.getEntityId(),
                command.getZona()
        );
        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
    }
}
