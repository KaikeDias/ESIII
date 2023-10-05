package q01;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Autor autor = new Autor(1, "João1", "joao.silva@example.com");
        Post post = new Post(1, "Texto do post", autor, new Date());

        RepositorioDePosts repositorio = new RepositorioDePosts();

        repositorio.saveToFile(post);

        Post postLido = repositorio.loadFromFile("posts.txt");

        if (postLido != null) {
            System.out.println("Post lido do arquivo:");
            System.out.println("ID: " + postLido.getId());
            System.out.println("Texto: " + postLido.getTexto());
            System.out.println("Autor: " + postLido.getAutor().getNome());
            System.out.println("Data: " + postLido.getData());
            System.out.println("Quantidade de Likes: " + postLido.getQuantidadeDeLikes());
        }
    }
}