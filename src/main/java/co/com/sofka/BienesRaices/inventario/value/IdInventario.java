package co.com.sofka.BienesRaices.inventario.value;

import co.com.sofka.domain.generic.Identity;

public class IdInventario extends Identity {


    public IdInventario() {
    }

    public IdInventario(String id) {
        super(id);
    }

    public static IdInventario of(String id){
        return new IdInventario(id);
    }

}
