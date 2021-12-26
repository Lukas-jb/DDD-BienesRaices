package useCase.Inventario;

import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.command.AgregarInmuebleContado;
import co.com.sofka.BienesRaices.inventario.event.InmuebleContadoAgregado;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.inventario.value.IdInventario;
import co.com.sofka.BienesRaices.inventario.value.Precio;
import co.com.sofka.BienesRaices.inventario.value.Tamano;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgregarInmuebleContadoUseCaseTest {

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
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

//afirmar
        var event = (InmuebleContadoAgregado) events.getDomainEvents().get(1);
        Assertions.assertEquals("Clle 30 20 10", event.getUbicacion().value());
        Assertions.assertEquals(100, event.getTamano().value());
        Assertions.assertEquals(200000000, event.getPrecio().value());


    }

}