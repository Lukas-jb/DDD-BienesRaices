package useCase.empleado;

import domain.empleado.Empleado;
import domain.empleado.command.AgregarAsesorCredito;
import domain.generic.Zona;
import domain.inventario.Inventario;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import static domain.empleado.Empleado.from;

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

