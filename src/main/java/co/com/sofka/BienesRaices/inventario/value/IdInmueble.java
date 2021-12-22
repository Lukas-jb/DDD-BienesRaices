package co.com.sofka.BienesRaices.inventario.value;

import co.com.sofka.domain.generic.Identity;

public class IdInmueble extends Identity {

    public IdInmueble() {
    }

    public IdInmueble(String id) {
        super(id);
    }

    public static IdInmueble of(String id){
        return new IdInmueble(id);
    }

}
