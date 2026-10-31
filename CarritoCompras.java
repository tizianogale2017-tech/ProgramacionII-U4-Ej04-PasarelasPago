package Ejercicio4_PasarelasPago;

public class CarritoCompras {
    public boolean finalizarCompra(ProcesadorPago pasarela, double total) {
        boolean aprobado = pasarela.efectuarCobro(total);
        System.out.printf("Compra de %,.2f con %s: %s%n", total,
                pasarela.getClass().getSimpleName(), aprobado ? "APROBADA" : "RECHAZADA");
        return aprobado;
    }
}
