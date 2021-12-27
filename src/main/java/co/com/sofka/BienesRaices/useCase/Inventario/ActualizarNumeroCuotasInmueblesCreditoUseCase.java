package co.com.sofka.BienesRaices.useCase.Inventario;

import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.generic.Zona;
import co.com.sofka.BienesRaices.domain.inventario.Inventario;
import co.com.sofka.BienesRaices.domain.inventario.command.ActualizarNumeroCuotasInmueblesCredito;
import co.com.sofka.BienesRaices.domain.inventario.value.*;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarNumeroCuotasInmueblesCreditoUseCase extends UseCase<RequestCommand<ActualizarNumeroCuotasInmueblesCredito>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ActualizarNumeroCuotasInmueblesCredito> actualizarNumeroCuotasInmueblesCreditoRequestCommand) {
        var command =actualizarNumeroCuotasInmueblesCreditoRequestCommand.getCommand();

        Inventario inventario;
        inventario = new Inventario(
                new IdInventario(),
                new Zona(Zona.Valor.NORTE)
        );

        inventario.agregarInmueblrCredito(
                new IdInmuebleCredito(),
                new Ubicacion("calle 43 d"),
                new Tamano(140),
                new Precio(5000000),
                new CuotaInicial(30000000),
                new NumeroCuotas(48)
        );
        inventario.actualizarNumeroCuotasInmueblesCredito(
                command.getEntityId(),
                command.getNumeroCuotas());

        emit().onResponse(new ResponseEvents(inventario.getUncommittedChanges()));

    }
}
