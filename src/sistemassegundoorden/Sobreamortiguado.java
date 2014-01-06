package sistemassegundoorden;

public class Sobreamortiguado {

    private double zeta, wn, raiz_chi_cuad;
/**
 * 
 * @param zeta: Factor de amortiguamiento, su valor debe ser mayor a 1
 * para entrar en este caso
 * @param wn: es la frecuencia natural no amortiguada.
 */
    public Sobreamortiguado(double zeta, double wn) {
        this.zeta = zeta;
        this.wn = wn;
        raiz_chi_cuad = Math.sqrt(zeta * zeta - 1);
    }

    public double ftCs(double s) {
        double den1, den2;
        den1 = s + zeta * wn + wn * raiz_chi_cuad;
        den2 = s + zeta * wn - wn * raiz_chi_cuad;
        return (wn * wn) / den1 * den2 * s;
    }

    public double ftct(double t) {
        double num, den1, den2;
        num = Math.exp(-wn * t * raiz_chi_cuad);
        den1 = 2 * raiz_chi_cuad * (zeta + raiz_chi_cuad);
        den2 = 2 * raiz_chi_cuad * (zeta - raiz_chi_cuad);
        return 1 + (num / den1) - (num / den2);
    }
}
