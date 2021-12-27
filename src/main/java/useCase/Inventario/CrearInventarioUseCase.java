package useCase.Inventario;

import domain.inventario.Inventario;
import domain.inventario.command.CrearInventario;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearInventarioUseCase extends UseCase<RequestCommand<CrearInventario>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearInventario> crearInventarioRequestCommand) {
        var comman = crearInventarioRequestCommand.getCommand();

        Inventario inventario;

        inventario = new Inventario(
                comman.getEntityId(),
                comman.getZona()
        );
        emit().onResponse(new ResponseEvents(inventario.getUncommittedChanges() ));

    }
}
