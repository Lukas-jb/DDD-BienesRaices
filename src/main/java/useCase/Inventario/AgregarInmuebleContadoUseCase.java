package useCase.Inventario;

import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.BienesRaices.inventario.Inventario;
import co.com.sofka.BienesRaices.inventario.command.AgregarInmuebleContado;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarInmuebleContadoUseCase extends UseCase<RequestCommand<AgregarInmuebleContado>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AgregarInmuebleContado> agregarInmuebleContadoRequestCommand) {

        var command = agregarInmuebleContadoRequestCommand.getCommand();

        Inventario inventario;

        inventario = Inventario.from(command.getIdInventario(),retrieveEvents());

        inventario.agregarInmuebleContado(
                command.getEntityId(),
                command.getUbicacion(),
                command.getTamano(),
                command.getPrecio()
        );

        emit().onResponse(new ResponseEvents(inventario.getUncommittedChanges()));


    }
}
