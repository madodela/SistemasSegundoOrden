package sistemassegundoorden;

public class CalculoParametros {

    Parametros param;
    private double chi;
    private int type;

    public CalculoParametros( Parametros param) {
        this.param = param;
        calcularParametros();
    }

    private void calcularParametros() {
        chi = param.getT2() / (2 * param.getWn());
        param.setChi(chi);
        if (chi > 0 && chi < 1) {
            param.setWd(param.getWn() * Math.sqrt(1 - chi * chi));
        }
        param.setSigma(chi * param.getWn());
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
