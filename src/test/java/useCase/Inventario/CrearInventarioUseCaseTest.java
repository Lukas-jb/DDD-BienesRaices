package useCase.Inventario;


import domain.generic.Zona;
import domain.inventario.command.CrearInventario;
import domain.inventario.event.InventarioCreado;
import domain.inventario.value.IdInventario;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearInventarioUseCaseTest {

    @Test
    void crearInventarioUseCaseTest() {

        //Arranque
        IdInventario idInventario = IdInventario.of("xxxx");
        Zona zona = new Zona(Zona.Valor.NORTE);

        var command = new CrearInventario(idInventario, zona);
        var useCase = new CrearInventarioUseCase();

        //actuacion
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        //afirmar
        InventarioCreado event = (InventarioCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals(Zona.Valor.NORTE, event.getZona().value());

    }

}