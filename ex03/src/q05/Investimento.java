package q05;

public class Investimento {
    private int id;
    private double valor;
    private TipoInvestimento tipo;
    private String statusRisco;

    public double getRetorno() {
        return retorno;
    }

    public void setRetorno(double retorno) {
        this.retorno = retorno;
    }

    private double retorno;

    public Investimento(int id, double valor, TipoInvestimento tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoInvestimento getTipo() {
        return tipo;
    }
}

