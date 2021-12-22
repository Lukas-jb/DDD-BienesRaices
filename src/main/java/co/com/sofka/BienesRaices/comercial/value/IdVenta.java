package co.com.sofka.BienesRaices.comercial.value;

import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.domain.generic.Identity;

public class IdVenta extends Identity {
    public IdVenta(){

    }

    public IdVenta(String id) {
        super(id);
    }

    public static IdVenta of(String id){
        return new IdVenta(id);
    }
}
