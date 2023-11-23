class Quadrado {
    private int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
}

class Retangulo extends Quadrado {
    private int altura;

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void setLado(int lado) {
        super.setLado(lado);
        this.altura = lado; // Violação do LSP
    }

    public int getAltura() {
        return altura;
    }
}


//No código acima, a classe Retangulo herda da classe Quadrado, mas o método setAltura redefine o comportamento do método setLado.
//Isso viola o LSP, já que o método setLado na classe base (Quadrado) deveria poder ser substituído sem alterar o comportamento esperado em classes derivadas.

//Solução:
//A solução seria redefinir a hierarquia de classes para que Quadrado e Retangulo não tenham uma relação de herança.
//Em vez disso, poderíamos ter uma classe Forma como base, e então Quadrado e Retangulo seriam apenas classes que implementam essa interface.

interface Forma {
    void setLado(int lado);
    int getLado();
}

class Quadrado implements Forma {
    private int lado;

    @Override
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int getLado() {
        return lado;
    }
}

class Retangulo implements Forma {
    private int largura;
    private int altura;

    @Override
    public void setLado(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getLado() {
        return largura;
    }
}
