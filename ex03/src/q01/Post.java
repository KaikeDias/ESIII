package q01;

import java.util.Date;

public class Post {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantidadeDeLikes() {
        return quantidadeDeLikes;
    }

    public void setQuantidadeDeLikes(int quantidadeDeLikes) {
        this.quantidadeDeLikes = quantidadeDeLikes;
    }

    private int id;
    private String texto;
    private Autor autor;
    private Date data;
    private int quantidadeDeLikes;

    public Post(int id, String texto, Autor autor, Date data) {
        this.id = id;
        this.texto = texto;
        this.autor = autor;
        this.data = new Date(data.getTime());
        this.quantidadeDeLikes = 0;
    }
}

