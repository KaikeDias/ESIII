package q05;


class InvestimentoService {
    public String avaliarRisco(Investimento investimento) {
        double variacaoPercentual = (investimento.getValor() - investimento.getRetorno()) / investimento.getValor();

        if(variacaoPercentual < 0.3) {
            return "BAIXO RISCO";
        } else if (variacaoPercentual < 0.5) {
            return "MEDIO RISCO";
        } else if (variacaoPercentual < 0.7) {
            return "ALTO RISCO";
        }
        return "ALTISSIMO RISCO";
    }
}

