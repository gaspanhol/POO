package POO;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    static void main() {
        Caixa<String> c = new Caixa<>("Olá mundo");
        Caixa<Pessoa> d = new Caixa<>(new Pessoa ("Joao"));

        // não precisa de typecasting
        String s = c.getConteudo();

        // erro de compilação, tipos incompatíveis
        String errado = d.getConteudo();

        ArrayList<String> teste = new ArrayList<>();

        HashMap<String,Boolean> testeHash = new HashMap<>();
    }
}
