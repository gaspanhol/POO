package POO;

public class Livro {
    private final String ISBN;
    private String titulo;
    private String autor;
    private int ano;


    public Livro(String ISBN, String titulo, String autor, int ano) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livros: " + "\n" +
                "Código ISBN= " + ISBN + "\n" +
                "Titulo= " + titulo + "\n" +
                "Autor= " + autor + "\n" +
                "Ano de publicação= " + ano + "\n";
    }
}
