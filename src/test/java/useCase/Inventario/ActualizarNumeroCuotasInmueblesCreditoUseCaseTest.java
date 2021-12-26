package useCase.Inventario;

import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.command.ActualizarNumeroCuotasInmueblesCredito;
import co.com.sofka.BienesRaices.inventario.command.AgregarInmuebleCredito;
import co.com.sofka.BienesRaices.inventario.event.NumeroCuotasInmuebleCreditoActualizado;
import co.com.sofka.BienesRaices.inventario.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActualizarNumeroCuotasInmueblesCreditoUseCaseTest {

    @Test
    void actualizarNumeroCuotasInmueblesCreditoUseCaseTest() {

//arranque
        IdInventario idInventario = IdInventario.of("SSS");
        IdInmuebleCredito idInmuebleCredito = new IdInmuebleCredito();
        Ubicacion ubicacion = new Ubicacion("calle 43 d");
        Tamano tamano = new Tamano(140);
        Precio precio = new Precio(5000000);
        CuotaInicial cuotaInicial = new CuotaInicial(30000000);
        NumeroCuotas numeroCuotas = new NumeroCuotas(48);

        var inmubleCredito =new AgregarInmuebleCredito(idInventario,idInmuebleCredito,ubicacion,tamano,precio,cuotaInicial,numeroCuotas);

        var command = new ActualizarNumeroCuotasInmueblesCredito(idInventario,
                idInmuebleCredito
                ,new NumeroCuotas(56));
        var useCase = new ActualizarNumeroCuotasInmueblesCreditoUseCase();


//actuador
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

//afirmar
        var event = (NumeroCuotasInmuebleCreditoActualizado)events.getDomainEvents().get(2);
        Assertions.assertEquals(56,event.getNumeroCuotas().value());
    }

}