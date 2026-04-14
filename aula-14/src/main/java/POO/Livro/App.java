package POO.Livro;

public class App {
    static void main() {
        Livro livro = new Livro("Como programar em POO", new Pessoa("Daniel", "123.456.789.10"));
        IO.println(livro);
    }
}
