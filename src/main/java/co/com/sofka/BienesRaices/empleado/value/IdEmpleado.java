package co.com.sofka.BienesRaices.empleado.value;

import co.com.sofka.domain.generic.Identity;

public class IdEmpleado extends Identity {

    public IdEmpleado(){

    }

    public IdEmpleado(String id) {
        super(id);
    }

    public static IdEmpleado of(String id){
        return new IdEmpleado(id);
    }
}
