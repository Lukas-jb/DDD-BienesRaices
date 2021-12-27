package useCase.comercial;

import domain.comercial.Comercial;
import domain.comercial.command.CrearComercial;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearComercialUseCase extends UseCase<RequestCommand<CrearComercial>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearComercial> crearComercialRequestCommand) {
        var comman =crearComercialRequestCommand.getCommand();

        Comercial comercial;
        comercial= new Comercial(
                comman.getEntityId(),
                comman.getTelefono(),
                comman.getUbicacion()
        );

        emit().onResponse(new ResponseEvents(comercial.getUncommittedChanges() ));


    }
}
