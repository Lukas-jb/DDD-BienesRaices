package co.com.sofka.BienesRaices.useCase.Inventario;

import co.com.sofka.BienesRaices.domain.generic.Ubicacion;
import co.com.sofka.BienesRaices.domain.generic.Zona;
import co.com.sofka.BienesRaices.domain.inventario.command.AgregarInmuebleContado;
import co.com.sofka.BienesRaices.domain.inventario.event.InmuebleContadoAgregado;
import co.com.sofka.BienesRaices.domain.inventario.event.InventarioCreado;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.domain.inventario.value.IdInventario;
import co.com.sofka.BienesRaices.domain.inventario.value.Precio;
import co.com.sofka.BienesRaices.domain.inventario.value.Tamano;
import co.com.sofka.BienesRaices.useCase.Inventario.AgregarInmuebleContadoUseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarInmuebleContadoUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void agregarInmuebleContadoUseCaseTest() {

//Arranque
        IdInventario idInventario = IdInventario.of("xxxx");
        IdInmuebleContado idInmuebleContado = new IdInmuebleContado();
        Ubicacion ubicacion = new Ubicacion("Clle 30 20 10");
        Tamano tamano = new Tamano(100);
        Precio precio = new Precio(200000000);

        var command = new AgregarInmuebleContado(idInventario, idInmuebleContado, ubicacion, tamano, precio);
        var useCase = new AgregarInmuebleContadoUseCase();

//actuador
        when(repository.getEventsBy("xxxx")).thenReturn(eventList());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("xxxx")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

//afirmar
        var event = (InmuebleContadoAgregado) events.getDomainEvents().get(0);
        Assertions.assertEquals("Clle 30 20 10", event.getUbicacion().value());
        Assertions.assertEquals(100, event.getTamano().value());
        Assertions.assertEquals(200000000, event.getPrecio().value());


    }
private List<DomainEvent> eventList(){
return List.of(new InventarioCreado(IdInventario.of("xxxx"),new Zona(Zona.Valor.NORTE)));
}

}