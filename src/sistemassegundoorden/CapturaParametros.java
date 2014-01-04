package sistemassegundoorden;

public class CapturaParametros {

    private double wn, wd, sigma, chi;
    private final double t2, num;
    private int type;

    public CapturaParametros(double num, double t2) {
        this.num = num;
        this.t2 = t2;
        calcularParametros();
    }

    public double getWn() {
        return this.wn;
    }

    public double getWd() {
        return this.wd;
    }

    public double getChi() {
        return this.chi;
    }

    public double getSigma() {
        return this.sigma;
    }

    private void calcularParametros() {
        wn = Math.sqrt(num);
        chi = t2 / (2 * wn);
        if (chi > 0 && chi < 1) {
            wd = wn * Math.sqrt(1 - chi * chi);
        }
        sigma = chi * wn;
    }

    public String getResult() {
        if (chi > 0 && chi < 1) {
            type = 1;
            return "Sistema subamortiguado";
        } else if (chi == 1) {
            type = 2;
            return "Sistema críticamente amortiguado";
        } else if (chi > 1) {
            type = 3;
            return "Sistema sobre-amortiguado";
        }
        type = 0;
        return "";
    }

    public int getType() {
        return type;
    }
}
