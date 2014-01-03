package sistemassegundoorden;

import java.util.Scanner;

public class CapturaParametros {

    private double t1, t2, num, wn, wd, sigma, chi;

    public CapturaParametros() {
        capturarCoeficientes();
        calcularParametros();
        imprimirParametros();
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

    private void imprimirParametros() {
        System.out.println("---------------RESULTADOS----------------");
        System.out.println("Wn = " + wn + "\n wd = "
                + wd + "\nchi = " + chi + "\nsigma = " + sigma);
        if (chi > 0 && chi < 1) {
            System.out.println("Sistema subamortiguado");
        } else if (chi == 1) {
            System.out.println("criticamente amortiguado");
        } else if (chi > 1) {
            System.out.println("sobreamortiguado");
        }
    }

    public static void main(String[] args) {
        CapturaParametros ini = new CapturaParametros();
    }
}
