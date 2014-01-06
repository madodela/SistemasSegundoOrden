package sistemassegundoorden;

public class CalculoParametros {

    Parametros param;
    private double zeta;
    private int type;

    public CalculoParametros( Parametros param) {
        this.param = param;
        calcularParametros();
    }

    private void calcularParametros() {
        zeta = param.getT2() / (2 * param.getWn());
        param.setChi(zeta);
        if (zeta > 0 && zeta < 1) {
            param.setWd(param.getWn() * Math.sqrt(1 - zeta * zeta));
        }
        param.setSigma(zeta * param.getWn());
    }

    public String getResult() {
        if (zeta > 0 && zeta < 1) {
            type = 1;
            return "Sistema subamortiguado";
        } else if (zeta == 1) {
            type = 2;
            return "Sistema críticamente amortiguado";
        } else if (zeta > 1) {
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
