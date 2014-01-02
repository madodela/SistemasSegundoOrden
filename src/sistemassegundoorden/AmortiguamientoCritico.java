package sistemassegundoorden;

public class AmortiguamientoCritico {

    private double wn;
/**
 * @param wn : es la frecuencia natural no amortiguada.
 */
    public AmortiguamientoCritico(double wn) {
        //aquí no recibe el valor de chi porque en este caso chi vale 1
        this.wn = wn;
    }

    public double ftCs(double s) {
        return (wn * wn) / (Math.pow(s + wn, 2) * s);
    }

    public double ftct(double t) {
        return 1 - Math.exp(-wn * t) * (1 + wn * t);
    }
}
