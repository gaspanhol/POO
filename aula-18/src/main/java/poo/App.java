package poo;

import poo.jogoJava.*;
import poo.produtos.Telefone;
import poo.produtos.SemFio;
import poo.produtos.Dimensao;

public class App {
    static void main (String[] args) {

        // Aplicação do produto telefone:

//        Telefone t = new Telefone(1,"12345","Samsung", 500, new Dimensao(200,100,2));
//
//        SemFio sf = new SemFio(2,"6789","Motorola", 500, new Dimensao(300,100,2), 200,30,4000);
//
//        Telefone a = new SemFio(3,"11111","Apple", 500, new Dimensao(250,100,2), 200,30,5000);
//
//        sf.getFrequencia();
//
//        ((SemFio)t).getFrequencia();
//
//        Telefone[] vetor = new Telefone[3];
//
//        vetor[0] = t;
//        vetor[1] = sf;
//        vetor[2] = a;
//
//        for (Telefone aux : vetor) {
//            if (aux instanceof SemFio novo) {
//                IO.println(novo.getFrequencia());
//            }
//        }

        // Aplicação do jogo Java of Empires:

        Aldeao Steve = new Aldeao();

        Arqueiro Legolas = new Arqueiro();

        Cavaleiro Aragorn = new Cavaleiro();

        Personagem[] vetor = new Personagem[3];

        vetor[0] = Steve;

        vetor[1] = Legolas;

        vetor[2] = Aragorn;

        for (Personagem p: vetor){
            IO.println(p.mover());
            if (p instanceof Guerreiro g) {
                IO.println(g.atacar());
            }
        }

    }
}

