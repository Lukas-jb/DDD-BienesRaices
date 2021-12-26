package useCase.Inventario;

import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.command.AgregarInmuebleCredito;
import co.com.sofka.BienesRaices.inventario.event.InmuebleCreditoAgregado;
import co.com.sofka.BienesRaices.inventario.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgregarInmuebleCreditoUseCaseTest {

    @Test

    void agregarInmuebleCreditoUseCaseTest(){

//Arranque
        IdInventario idInventario = IdInventario.of("xxxx");
        IdInmuebleCredito idInmuebleCredito = new IdInmuebleCredito();
        Ubicacion ubicacion = new Ubicacion("clle 10 43d 50");
        Tamano tamano = new Tamano(70);
        Precio precio = new Precio(100000000);
        CuotaInicial cuotaInicial= new CuotaInicial(40000000);
        NumeroCuotas numeroCuotas= new NumeroCuotas(60);

        var command = new AgregarInmuebleCredito(idInventario, idInmuebleCredito, ubicacion, tamano, precio, cuotaInicial, numeroCuotas);
        var useCase = new AgregarInmuebleCreditoUseCase();

//actuador
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

//afirmar
        var event = (InmuebleCreditoAgregado) events.getDomainEvents().get(1);
        Assertions.assertEquals("clle 10 43d 50", event.getUbicacion().value());
        Assertions.assertEquals(70, event.getTamano().value());
        Assertions.assertEquals(100000000, event.getPrecio().value());
        Assertions.assertEquals(40000000, event.getCuotaInicial().value());
        Assertions.assertEquals(60, event.getNumeroCuotas().value());


    }


}