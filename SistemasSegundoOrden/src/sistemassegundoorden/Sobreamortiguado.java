package sistemassegundoorden;

public class Sobreamortiguado {

    private double chi, wn, raiz_chi_cuad;

    public Sobreamortiguado(double chi, double wn) {
        this.chi = chi;
        this.wn = wn;
        raiz_chi_cuad = Math.sqrt(chi * chi - 1);
    }

    public double ftCs(double s) {
        double den1, den2;
        den1 = s + chi * wn + wn * raiz_chi_cuad;
        den2 = s + chi * wn - wn * raiz_chi_cuad;
        return (wn * wn) / den1 * den2 * s;
    }

    public double ftct(double t) {
        double num, den1, den2;
        num = Math.exp(-wn * t * raiz_chi_cuad);
        den1 = 2 * raiz_chi_cuad * (chi + raiz_chi_cuad);
        den2 = 2 * raiz_chi_cuad * (chi - raiz_chi_cuad);
        return 1 + (num / den1) - (num / den2);
    }
}
