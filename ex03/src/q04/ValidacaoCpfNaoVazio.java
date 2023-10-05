package q04;

public class ValidacaoCpfNaoVazio implements Validacao {

    public void validar(ImpostoDeRenda2 impostoDeRenda) {
        if (impostoDeRenda.getCpfContribuinte().isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser vazio");
        }
    }
}
