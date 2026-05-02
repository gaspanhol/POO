package POO.Livro;

import java.time.LocalDate;

public class App {
    static void main() {
        Livro livro = new Livro("Como programar em POO", new Autor("Daniel", "Alves", LocalDate.parse("2024-12-31"), "Brasileiro"));
        livro.adicionaCapitulo("Introdução");
        livro.adicionaCapitulo("Capitulo 1");
        livro.adicionaCapitulo("Capitulo 2");

        IO.println(livro);

        livro = null;
        IO.println(livro);
    }
}
