package co.com.sofka.BienesRaices.useCase.comercial;

import co.com.sofka.BienesRaices.domain.comercial.Comercial;
import co.com.sofka.BienesRaices.domain.comercial.command.ActualizarNombreCliente;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarNombreClienteUseCase extends UseCase<RequestCommand<ActualizarNombreCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreCliente> actualizarNombreClienteRequestCommand) {

        var command = actualizarNombreClienteRequestCommand.getCommand();

        Comercial comercial;
        comercial = Comercial.from(command.getIdComercial(), retrieveEvents());
        comercial.actualizarNombreCliente(command.getEntityId(),
                command.getNombre());

        emit().onResponse(new ResponseEvents(comercial.getUncommittedChanges()));

    }
}
