package co.com.sofka.BienesRaices.domain.inventario.value;

import co.com.sofka.domain.generic.Identity;

public class IdInmuebleCredito extends Identity{

    public IdInmuebleCredito() {
    }

    public IdInmuebleCredito(String id) {
        super(id);
    }

    public static IdInmuebleCredito of(String id){
        return new IdInmuebleCredito(id);
    }

}
