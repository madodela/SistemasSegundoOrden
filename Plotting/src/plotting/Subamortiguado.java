package plotting;

public class Subamortiguado {
//(0 < chi < 1)

    private double wn, chi, wd;
/**
 * @param wn: es la frecuencia natural no amortiguada.
 * @param chi: Factor de amortiguamiento, su valor debe estar entre 0 y 1.
 */
    public Subamortiguado(double wn, double chi) {
        this.wn = wn;
       // chi = Math.random();
        this.chi = chi;
        wd = wn * Math.sqrt(1 - chi * chi);
    }
/**
 * @param s: es la frecuencia
 * @return el valor de la respuesta en una frecuencia dada
 */
    public double ftCs(int s) {
        double num, den;
        num = wn * wn;
        den = s * (s * s + 2 * chi * wn * s + wn * wn);
        return num / den;
    }
/**
 * 
 * @param t: tiempo en que se evaluará la función
 * @return el valor de la respuesta en el tiempo dado
 */
    public double ftct(double t) {
        double ct1, ct2;
        ct1 = (Math.exp(-chi * wn * t) / Math.sqrt(1 - chi * chi));
        ct2 = wd * t +(1/Math.tan(Math.sqrt(1 - chi * chi) / chi)) ;
        return 1 - ct1 * Math.sin(ct2);
    }
}
