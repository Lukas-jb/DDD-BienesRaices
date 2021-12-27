package domain.inventario.value;

import co.com.sofka.domain.generic.Identity;

public class IdInmuebleContado extends Identity {

    public IdInmuebleContado() {
    }

    public IdInmuebleContado(String id) {
        super(id);
    }

    public static IdInmuebleContado of(String id){
        return new IdInmuebleContado(id);
    }

}
