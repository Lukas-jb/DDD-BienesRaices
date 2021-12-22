package co.com.sofka.BienesRaices.empleado.value;

import co.com.sofka.domain.generic.Identity;

public class IdAsesorCredito extends Identity {


    public IdAsesorCredito(){

    }

    public IdAsesorCredito(String id) {
        super(id);
    }

    public static IdAsesorCredito of(String id){
        return new IdAsesorCredito(id);
    }
}
