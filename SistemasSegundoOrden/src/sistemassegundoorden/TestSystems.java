package sistemassegundoorden;

public class TestSystems {

    public static void main(String[] args) {
        Subamortiguado suba = new Subamortiguado(Math.sqrt(2.5), 0.5);
        for (double t = 0; t < 10; t = t + 0.1) {
            System.out.println(suba.ftct(t));
        }
    }
    
}
