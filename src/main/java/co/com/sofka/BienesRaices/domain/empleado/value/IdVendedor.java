package co.com.sofka.BienesRaices.domain.empleado.value;

import co.com.sofka.domain.generic.Identity;

public class IdVendedor extends Identity {

    public IdVendedor() {

    }

    public IdVendedor(String id) {
        super(id);
    }

    public static IdVendedor of(String id) {
        return new IdVendedor(id);
    }
}
