package poo;

public class Livro {
    private final String ISBN;
    private String nome;
    private String autor;
    private boolean emprestado;

    public Livro(String ISBN, String nome, String autor, boolean emprestado) {
        this.ISBN = ISBN;
        this.nome = nome;
        this.autor = autor;
        this.emprestado = emprestado;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
