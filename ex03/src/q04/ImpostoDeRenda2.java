package q04;

import q03.CalculadoraImpostoDeRenda;

import java.util.List;

public class ImpostoDeRenda2 {

    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda2(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public void processar(List<Validacao> validacoes) {
        for (Validacao validacao : validacoes) {
            validacao.validar(this);
        }

        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas);

        RelatorioImpostoDeRenda2 relatorio = new RelatorioImpostoDeRenda2();
        relatorio.gerarRelatorio(this, impostoDevido);
    }

    // Getters para acesso aos atributos
    public String getCpfContribuinte() {
        return cpfContribuinte;
    }

    public List<Double> getRendimentos() {
        return rendimentos;
    }

    public List<Double> getDespesas() {
        return despesas;
    }
}
