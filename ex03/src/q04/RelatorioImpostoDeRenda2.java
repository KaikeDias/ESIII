package q04;

public class RelatorioImpostoDeRenda2 {

    public void gerarRelatorio(ImpostoDeRenda2 impostoDeRenda, double impostoDevido) {
        System.out.println("CPF: " + impostoDeRenda.getCpfContribuinte());
        System.out.println("Rendimentos: " + impostoDeRenda.getRendimentos());
        System.out.println("Despesas: " + impostoDeRenda.getDespesas());
        System.out.println("Imposto Devido: " + impostoDevido);
    }
}

