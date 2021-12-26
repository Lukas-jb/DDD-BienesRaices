package co.com.sofka.BienesRaices.inventario.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCuotas implements ValueObject<Integer> {

    private final int value;

    public NumeroCuotas(int value){
        this.value = Objects.requireNonNull(value);
        if(this.value == 0){
            throw new IllegalArgumentException("El numero de cuotas no puede ser cero");
        }
        if(this.value < 36){
            throw new IllegalArgumentException("El numero de cuotas no puede ser menor 36");//Rn: creditos maximo a 5 años
        }
        if(this.value > 120){
            throw new IllegalArgumentException("El numero de cuotas no puede ser superiro 120"); //Rn: creditos maximo a 10 años
        }

    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroCuotas that = (NumeroCuotas) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
