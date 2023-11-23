import java.util.ArrayList;
import java.util.List;
//Integranntes: Kaike Dias, Igor Julliano, Kelson Eduardo

public class Perfil {
    private int id;
    private String nomeUsuario;

    public Perfil(int id, String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.id = id;
    }

    // Outros métodos
}

public interface Publicavel {
    void exibir();
    Perfil getAutor();
}

public class Postagem implements Publicavel {
    private String id;
    private Perfil autor;
    private String conteudo;
    private List<Reacao> reacoes;
    private List<Comentario> comentarios;

    public Postagem(String id, Perfil autor, String conteudo) {
        this.id = id;
        this.autor = autor;
        this.conteudo = conteudo;
        this.reacoes = new ArrayList<>();
        this.comentarios = new ArrayList<>();
    }

    public void adicionarReacao(Reacao reacao) {
        reacoes.add(reacao);
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    @Override
    public void exibir() {
        System.out.println("Postagem [" + id + "] de " + autor.getNomeUsuario() +
                ": " + conteudo);
        System.out.println("Reações:");
        for (Reacao reacao : reacoes) {
            reacao.exibir();
        }
        System.out.println("Comentários:");
        for (Comentario comentario : comentarios) {
            comentario.exibir();
        }
    }

    @Override
    public Perfil getAutor() {
        return autor;
    }

    // Outros métodos
}

public class Reacao implements Publicavel {
    private String tipoReacao;
    private Postagem postagem;

    public Reacao(String tipoReacao, Postagem postagem) {
        this.tipoReacao = tipoReacao;
        this.postagem = postagem;
        postagem.adicionarReacao(this);
    }

    @Override
    public void exibir() {
        System.out.println("Reação [" + tipoReacao + "] de " +
                postagem.getAutor().getNomeUsuario() + " na postagem " + postagem.getId());
    }

    @Override
    public Perfil getAutor() {
        return postagem.getAutor();
    }

    // Outros métodos
}

public class Comentario implements Publicavel {
    private Postagem postagem;
    private String conteudo;

    public Comentario(String conteudo, Postagem postagem) {
        this.conteudo = conteudo;
        this.postagem = postagem;
        postagem.adicionarComentario(this);
    }

    @Override
    public void exibir() {
        System.out.println("Comentário de " + postagem.getAutor().getNomeUsuario() + " em resposta a postagem [" +
                postagem.getId() + "]: " + conteudo);
    }

    @Override
    public Perfil getAutor() {
        return postagem.getAutor();
    }

    // Outros métodos
}
