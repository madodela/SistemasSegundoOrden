package sistemassegundoorden;

public class AmortiguamientoCritico {

    private double wn;

    public AmortiguamientoCritico(double wn) {
        this.wn = wn;
    }

    public double ftCs(double s) {
        return (wn * wn) / (Math.pow(s + wn, 2) * s);
    }

    public double ftct(double t) {
        return 1 - Math.exp(-wn * t) * (1 + wn * t);
    }
}
