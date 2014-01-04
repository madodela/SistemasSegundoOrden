package sistemassegundoorden;

public class Parametros {

    private double wn, wd, sigma, chi;
    private double t2, num;

    public Parametros() {

    }

    public Parametros(double num, double t2) {
        this.t2 = t2;
        this.num = num;
        wn = Math.sqrt(num);
    }

    public double getWn() {
        return wn;
    }

    public double getWd() {
        return wd;
    }

    public void setWd(double wd) {
        this.wd = wd;
    }

    public double getSigma() {
        return sigma;
    }

    public void setSigma(double sigma) {
        this.sigma = sigma;
    }

    public double getChi() {
        return chi;
    }

    public void setChi(double chi) {
        this.chi = chi;
    }

    public double getT2() {
        return t2;
    }

    public double getNum() {
        return num;
    }
}
