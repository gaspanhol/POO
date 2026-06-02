package POO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main() {

        // ..:: Conteúdo de tipos genêricos de objetos ::..
//        Caixa<String> c = new Caixa<>("Olá mundo");
//        Caixa<Pessoa> d = new Caixa<>(new Pessoa ("Joao"));
//
//        // não precisa de typecasting
//        String s = c.getConteudo();
//
//        // erro de compilação, tipos incompatíveis
//        String errado = d.getConteudo();
//
//        ArrayList<String> teste = new ArrayList<>();
//
//        HashMap<String,Boolean> testeHash = new HashMap<>();

        // ..:: Conteúdo de tratamento de excessão ::..
        Scanner ler = new Scanner(System.in);
        int a, b;

        try{
            System.out.println("Entre com o número: ");
            a = ler.nextInt();
            System.out.println("Entre com o número: ");
            b = ler.nextInt();

            int res = a/b;

            System.out.println(a + " Dividido por " + b + " = " + res);
        }catch (InputMismatchException e) {
            System.err.println("Só é permitido números inteiros");
            ler.nextLine(); // limpa o buffer do teclado
        }catch (ArithmeticException e) {
            System.err.println("Não é possível realizar divisões por 0");
            ler.nextLine();
        }catch (Exception e) {
            System.err.println("Comportamento inesperado");
            ler.nextLine();
        }
        System.out.println("Fim do programa");
    }
}
