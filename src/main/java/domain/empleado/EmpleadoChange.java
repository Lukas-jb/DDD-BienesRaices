package domain.empleado;

import domain.empleado.event.*;
import co.com.sofka.domain.generic.EventChange;

public class EmpleadoChange extends EventChange {

    public EmpleadoChange(Empleado empleado) {

        apply((EmpleadoCreado event) -> {
            empleado.zona = event.getZona();
        });
        apply((VendedorAgregado event) -> {
            var Vendedores = empleado.vendedores.add(new Vendedor(
                    event.getEntityId(),
                    event.getTelefono(),
                    event.getNombre()
            ));
        });
        apply((AsesorCreditoAgregado event) -> {
            empleado.asesorCredito.nombre = event.getNombre();
            empleado.asesorCredito.telefono = event.getTelefono();
        });
        apply((GerenteAgregado event) -> {
            empleado.gerente.nombre = event.getNombre();
            empleado.gerente.telefono = event.getTelefono();
        });
        apply((NombreGerenteActualizado event) -> {
            empleado.gerente.nombre = event.getNombre();
        });
        apply((NombreVendedorActualizado event) -> {
            var vendedor = empleado.getIdVendedorporID(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el auxiliar veterinario"));
            vendedor.ActualizarNombre(event.getNombre());
        });
        apply((TelefonoAsesorCreditoActualizado event) -> {
            empleado.asesorCredito.nombre = event.getTelefono();
        });
        apply((TelefonoGerenteActualizado event) -> {
            empleado.gerente.telefono = event.getTelefono();
        });
        apply((TelefonoVendedorActualizado event) -> {
            var vendedor = empleado.getIdVendedorporID(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el auxiliar veterinario"));
            vendedor.ActualizarTelefono(event.getTelefono());
        });
    }
}
