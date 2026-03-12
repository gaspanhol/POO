package POO;

import POO.Contador.Contador;
import POO.Personagem.Personagem;

import java.util.Random;

public class Main {
    static void main() {

//        //Contador:
//        Contador c = new Contador();
//        c.valor(100);
//        c.incrementar();
//        System.out.println(c.valorContador());

        //Personagem:
        Personagem personagem = new Personagem();

        System.out.println("Digite o nome, classe, altura, raca e sexo ");
        personagem.setNome(IO.readln("Nome: "));
        personagem.setClasse(IO.readln("Classe: "));
        personagem.setAltura(Double.parseDouble(IO.readln("Altura: ")));
        personagem.setRaca(IO.readln("Raça: "));
        personagem.setSexo(IO.readln("sexo: "));

        System.out.println(personagem.getFichaPersonagem());

        System.out.println("Jogue um dado digitando \"rolar dado\" ");
        Random r = new Random();
        int valor = 0;
        if (IO.readln().equals("rolar dado")) {
            valor = r.nextInt(1, 21);
        }

    }
}

