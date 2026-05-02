package POO.Livro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Autor {
    private String nome;
    private String sobrenome;
    private LocalDate dataNacimento;
    private String nacionalidade;

    public Autor(String nome, String sobrenome, LocalDate dataNacimento, String nacionalidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNacimento = dataNacimento;
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("""
                Nome: %s
                Sobrenome: %s
                Data de Nascimento: %s
                Nacionalidade: %s
               """, nome, sobrenome, dataNacimento.format(formatoBR), nacionalidade);
    }
}
