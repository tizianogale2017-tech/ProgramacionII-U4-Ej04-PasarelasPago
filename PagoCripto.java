package Ejercicio4_PasarelasPago;

public class PagoCripto implements ProcesadorPago {
    private static final double COTIZACION_USD_ARS = 1000;
    private double saldoUsd;

    public PagoCripto(double saldoUsd) {
        this.saldoUsd = saldoUsd;
    }

    @Override
    public boolean efectuarCobro(double monto) {
        double montoUsd = monto / COTIZACION_USD_ARS;
        if (monto <= 0 || montoUsd > saldoUsd) {
            return false;
        }
        saldoUsd -= montoUsd;
        return true;
    }

    public double getSaldoUsd() { return saldoUsd; }
}
