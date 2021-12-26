package useCase.Inventario;

import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.BienesRaices.inventario.Inventario;
import co.com.sofka.BienesRaices.inventario.command.AgregarInmuebleCredito;
import co.com.sofka.BienesRaices.inventario.command.CrearInventario;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleCredito;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarInmuebleCreditoUseCase extends UseCase<RequestCommand<AgregarInmuebleCredito>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarInmuebleCredito> agregarInmuebleCreditoRequestCommand) {
        var command = agregarInmuebleCreditoRequestCommand.getCommand();

        Inventario inventario;

        inventario = new Inventario(
                new IdInventario(),
                new Zona(Zona.Valor.NORTE)
        );

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
