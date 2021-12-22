package co.com.sofka.BienesRaices.comercial.value;

import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
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
