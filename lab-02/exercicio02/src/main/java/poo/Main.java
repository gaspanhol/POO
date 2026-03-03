package poo;

import java.util.Random;

public class Main {
    static void main() {

        Random r = new Random();
        int resultado = r.nextInt(1,101); //vai sortear um número de 1 até 100
        int tentativas = 1;
        int resposta;
        do{
            resposta = Integer.parseInt(IO.readln("Escreva um número entre 1 e 100 para descobrir se ele é o número sorteado: "));
            if (resposta == resultado){
                IO.println("Parabéns, você acertou o número!");
                IO.println("foram necessárias " + tentativas + " tentativas!");
            } else {
                tentativas++;
                IO.print("Infelizmente você errou o número sorteado é, ");
                if(resposta < resultado){
                    IO.println("maior, tente novamente");
                } else {
                    IO.println("menor, tente novamente");
                }
            }
        } while(resposta != resultado);
    }
}
