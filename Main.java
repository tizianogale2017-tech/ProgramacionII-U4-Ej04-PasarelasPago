package Ejercicio4_PasarelasPago;

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        ProcesadorPago tarjeta = new PagoTarjetaCredito(50000);
        ProcesadorPago cripto = new PagoCripto(20);
        ProcesadorPago billetera = new PagoBilleteraDigital(10000, "TOKEN-OK", "TOKEN-OK");
        ProcesadorPago billeteraRobada = new PagoBilleteraDigital(10000, "TOKEN-OK", "TOKEN-FALSO");

        carrito.finalizarCompra(tarjeta, 30000);
        carrito.finalizarCompra(tarjeta, 30000);
        carrito.finalizarCompra(cripto, 15000);
        carrito.finalizarCompra(cripto, 8000);
        carrito.finalizarCompra(billetera, 9500);
        carrito.finalizarCompra(billeteraRobada, 100);
    }
}
