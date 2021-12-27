package domain.inventario.value;

import co.com.sofka.domain.generic.Identity;

public class IdInmuebleSobrePlanos extends Identity {

    public IdInmuebleSobrePlanos() {
    }

    public IdInmuebleSobrePlanos(String id) {
        super(id);
    }

    public static IdInmuebleContado of(String id){
        return new IdInmuebleContado(id);
    }

}
