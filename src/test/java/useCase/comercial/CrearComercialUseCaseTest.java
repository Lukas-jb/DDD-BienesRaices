package useCase.comercial;

import domain.comercial.command.CrearComercial;
import domain.comercial.event.ComercialCreado;
import domain.comercial.value.IdComercial;
import domain.generic.Telefono;
import domain.generic.Ubicacion;
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