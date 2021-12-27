package co.com.sofka.BienesRaices.useCase.comercial;

import co.com.sofka.BienesRaices.domain.comercial.Comercial;
import co.com.sofka.BienesRaices.domain.comercial.command.AgregarCliente;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarClienteUseCase extends UseCase<RequestCommand<AgregarCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarCliente> agregarClienteRequestCommand) {
        var command = agregarClienteRequestCommand.getCommand();

        Comercial comercial;
        comercial = Comercial.from(command.getIdComercial(), retrieveEvents());

        comercial.agregarCliente(
                command.getEntityId(),
                command.getNombre(),
                command.getTelefono());

        emit().onResponse(new ResponseEvents(comercial.getUncommittedChanges()));

    }
}
