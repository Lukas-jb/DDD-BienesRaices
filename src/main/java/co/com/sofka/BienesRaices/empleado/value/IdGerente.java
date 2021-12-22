package co.com.sofka.BienesRaices.empleado.value;

import co.com.sofka.domain.generic.Identity;

public class IdGerente extends Identity {

    public IdGerente(){

    }

    public IdGerente(String id) {
        super(id);
    }

    public static IdGerente of(String id){
        return new IdGerente(id);
    }
}
