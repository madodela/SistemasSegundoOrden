package plotting;

public class TestSystems {

    public static void main(String[] args) {
        double t;
        double[] x, y;
        x = new double[101];
        y = new double[101];
        int cont = 0;
        System.out.println("----CASO SUBAMORTIGUADO----");
        Subamortiguado sub_amor = new Subamortiguado(Math.sqrt(2.5), 0.5);
        for (t = 0; t < 10; t = t + 0.1) {
            x[cont] = t;
            System.out.println(sub_amor.ftct(t));
            y[cont] = sub_amor.ftct(t);
            cont++;
        }
        System.out.println("count = "+cont);
        Plotting plot = new Plotting();
        plot.graficar(x, y);
        /*System.out.println("----CASO AMORTIGUAMIENTO CRITICO----");
         AmortiguamientoCritico amor_crit = new AmortiguamientoCritico(Math.sqrt(2.5));
         for (t = 0; t < 10; t = t + 0.1) {
         System.out.println(amor_crit.ftct(t));
         }
         System.out.println("----CASO SOBREAMORTIGUADO----");
         Sobreamortiguado sob_amor = new Sobreamortiguado(2, Math.sqrt(2.5));
         for (t = 0; t < 10; t = t + 0.1) {
         System.out.println(sob_amor.ftct(t));
         }*/
    }

}
