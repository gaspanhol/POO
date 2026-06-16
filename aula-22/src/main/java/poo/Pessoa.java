package poo;

public class Pessoa {
    private String nome;
    private String CPF;
    protected int livrosEmprestados;

    public Pessoa(String nome, String CPF, int livrosEmprestados) {
        this.nome = nome;
        this.CPF = CPF;
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
