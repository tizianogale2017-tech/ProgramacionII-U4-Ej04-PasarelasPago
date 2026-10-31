package Ejercicio4_PasarelasPago;

public class PagoTarjetaCredito implements ProcesadorPago {
    private double limiteDisponible;

    public PagoTarjetaCredito(double limiteDisponible) {
        this.limiteDisponible = limiteDisponible;
    }

    @Override
    public boolean efectuarCobro(double monto) {
        if (monto <= 0 || monto > limiteDisponible) {
            return false;
        }
        limiteDisponible -= monto;
        return true;
    }

    public double getLimiteDisponible() { return limiteDisponible; }
}
