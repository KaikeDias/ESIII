package q04;

public class ValidacaoCpfTamanho implements Validacao {

    public void validar(ImpostoDeRenda2 impostoDeRenda) {
        if (impostoDeRenda.getCpfContribuinte().length() != 11) {
            throw new IllegalArgumentException("CPF deve ter 11 caracteres");
        }
    }
}
