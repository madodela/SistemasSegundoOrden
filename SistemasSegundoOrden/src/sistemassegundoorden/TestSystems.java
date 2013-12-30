package sistemassegundoorden;

public class TestSystems {

    public static void main(String[] args) {
        double t;
        System.out.println("----CASO SUBAMORTIGUADO----");
        Subamortiguado sub_amor = new Subamortiguado(Math.sqrt(2.5), 0.5);
        for (t = 0; t < 10; t = t + 0.1) {
            System.out.println(sub_amor.ftct(t));
        }
        System.out.println("----CASO AMORTIGUAMIENTO CRITICO----");
        AmortiguamientoCritico amor_crit = new AmortiguamientoCritico(Math.sqrt(2.5));
        for (t = 0; t < 10; t = t + 0.1) {
            System.out.println(amor_crit.ftct(t));
        }
        System.out.println("----CASO SOBREAMORTIGUADO----");
        Sobreamortiguado sob_amor = new Sobreamortiguado(2, Math.sqrt(2.5));
        for (t = 0; t < 10; t = t + 0.1) {
            System.out.println(sob_amor.ftct(t));
        }
    }

}
