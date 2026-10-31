package Ejercicio4_PasarelasPago;

public class PagoBilleteraDigital implements ProcesadorPago {
    private double saldo;
    private final String tokenAutorizado;
    private final String tokenPresentado;

    public PagoBilleteraDigital(double saldo, String tokenAutorizado, String tokenPresentado) {
        this.saldo = saldo;
        this.tokenAutorizado = tokenAutorizado;
        this.tokenPresentado = tokenPresentado;
    }

    @Override
    public boolean efectuarCobro(double monto) {
        if (!tokenAutorizado.equals(tokenPresentado) || monto <= 0 || monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }

    public double getSaldo() { return saldo; }
}
