package domain.comercial.value;

import co.com.sofka.domain.generic.Identity;

public class IdSalaVentas extends Identity {
    public IdSalaVentas(){

    }

    public IdSalaVentas(String id) {
        super(id);
    }

    public static IdSalaVentas of(String id){
        return new IdSalaVentas(id);
    }
}
