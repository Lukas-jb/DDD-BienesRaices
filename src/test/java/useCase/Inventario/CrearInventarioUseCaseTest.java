package useCase.Inventario;


import co.com.sofka.BienesRaices.generic.Zona;
import co.com.sofka.BienesRaices.inventario.command.CrearInventario;
import co.com.sofka.BienesRaices.inventario.event.InventarioCreado;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearInventarioUseCaseTest {

    @Test
    void crearInventarioUseCaseTest() {

        //Arranque
        IdInventario idInventario = IdInventario.of("xxxx");
        Zona zona = new Zona(Zona.Valor.NORTE);

        var command = new CrearInventario(idInventario, zona );
        var useCase = new CrearInventarioUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        InventarioCreado event = (InventarioCreado)events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals(Zona.Valor.NORTE , event.getZona().value());

    }

}