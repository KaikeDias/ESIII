package q02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(5, 3);

        List<Operacao> operacoes = new ArrayList<>();
        operacoes.add(new Soma());
        operacoes.add(new Subtracao());

        List<Double> resultados = calculadora.calcular(operacoes);

        for (double resultado : resultados) {
            System.out.println(resultado);
        }
    }
}

