package co.com.sofka.BienesRaices.useCase.Inventario;

import co.com.sofka.BienesRaices.domain.inventario.Inventario;
import co.com.sofka.BienesRaices.domain.inventario.command.AgregarInmuebleCredito;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarInmuebleCreditoUseCase extends UseCase<RequestCommand<AgregarInmuebleCredito>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarInmuebleCredito> agregarInmuebleCreditoRequestCommand) {

        var command = agregarInmuebleCreditoRequestCommand.getCommand();

        Inventario inventario;
        inventario = Inventario.from(command.getInventario(), retrieveEvents());

        inventario.agregarInmueblrCredito(
                command.getEntityId(),
                command.getUbicacion(),
                command.getTamano(),
                command.getPrecio(),
                command.getCuotaInicial(),
                command.getNumeroCuotas()
        );
        emit().onResponse(new ResponseEvents(inventario.getUncommittedChanges()));

    }
}
