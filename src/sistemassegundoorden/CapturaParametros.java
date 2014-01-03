package sistemassegundoorden;

import java.util.Scanner;

public class CapturaParametros {

    private double t1, t2, num, wn, wd, sigma, chi;
    private int type;

    public CapturaParametros(double num,double t1,double t2) {
        this.num = num;
        this.t1 = t1;
        this.t2 = t2;
        calcularParametros();
    }
    
    public double getWn(){
        return this.wn;
    }
    
    public double getWd(){
        return this.wd;
    }
    
    public double getChi(){
        return this.chi;
    }
    
    public double getSigma(){
        return this.sigma;
    }

    private void capturarCoeficientes() {
        Scanner cin = new Scanner(System.in);
        System.out.print("Numerador: ");
        num = cin.nextDouble();
        System.out.print("Coeficiente de término de segundo grado: ");
        t1 = cin.nextDouble();
        System.out.print("Coeficiente de término de primer grado: ");
        t2 = cin.nextDouble();
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
        /*System.out.println("---------------RESULTADOS----------------");
        System.out.println("Wn = " + wn + "\n wd = "
                + wd + "\nchi = " + chi + "\nsigma = " + sigma);*/
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
    
    public int getType(){
        return type;
    }
}
