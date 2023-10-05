package q01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class RepositorioDePosts {

    public void saveToFile(Post post) {
        String filePath = "posts.txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("ID: " + post.getId() + "\n");
            writer.write("Texto: " + post.getTexto() + "\n");
            writer.write("Autor: " + post.getAutor().getNome() + "\n");
            writer.write("Data: " + post.getData().toString() + "\n");
            writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Post loadFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int id = Integer.parseInt(reader.readLine().split(":")[1].trim());
            String texto = reader.readLine().split(":")[1].trim();
            String nomeAutor = reader.readLine().split(":")[1].trim();
            String dataStr = reader.readLine().split(":")[1].trim();
            int quantidadeDeLikes = Integer.parseInt(reader.readLine().split(":")[1].trim());

            Date data = new Date(dataStr);

            Autor autor = new Autor(id, nomeAutor, "");

            return new Post(id, texto, autor, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
