package co.com.sofka.BienesRaices.domain.comercial.value;

import co.com.sofka.domain.generic.Identity;

public class IdComercial extends Identity {
    public IdComercial(){

    }

    public IdComercial(String id) {
        super(id);
    }

    public static IdComercial of(String id){
        return new IdComercial(id);
    }
}
