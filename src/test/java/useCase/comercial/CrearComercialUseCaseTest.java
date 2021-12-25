package useCase.comercial;

import co.com.sofka.BienesRaices.comercial.command.CrearComercial;
import co.com.sofka.BienesRaices.comercial.event.ComercialCreado;
import co.com.sofka.BienesRaices.comercial.value.IdComercial;
import co.com.sofka.BienesRaices.generic.Telefono;
import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CrearComercialUseCaseTest {

    @Test

    void crearComercialUseCaseTest(){
        //arranque
        IdComercial idComercial = IdComercial.of("XXX");
        Telefono telefono = new Telefono("301458798");
        Ubicacion ubicacion = new Ubicacion("calle 4 25 78");

        var command = new CrearComercial(idComercial,telefono,ubicacion);
        var useCase = new CrearComercialUseCase();

        //actuacion
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        //afirmar
        ComercialCreado event = (ComercialCreado)events.getDomainEvents().get(0);
        Assertions.assertEquals("XXX",event.aggregateRootId());
        Assertions.assertEquals("301458798", event.getTelefono().value());
        Assertions.assertEquals("calle 4 25 78",event.getUbicacion().value());
    }

}