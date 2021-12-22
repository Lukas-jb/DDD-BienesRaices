package co.com.sofka.BienesRaices.empleado;

import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.domain.generic.AggregateRoot;


public class Empleado extends AggregateRoot<IdEmpleado> {

    public Empleado(IdEmpleado entityId) {
        super(entityId);
    }
}
