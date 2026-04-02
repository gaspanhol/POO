package POO;

import java.awt.*;
import java.awt.image.ImagingOpException;
import java.util.ArrayList;

public class App {

    private ArrayList<ContaBancaria> contas;

    public App(){
        this.contas = new ArrayList<>();
    }

    void menu(int opcao){
        switch (opcao) {
            case 1 -> {cadastrar();}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
        }
    }

    void cadastrar(){
        var titular = IO.readln("Nome do titular: ");
        var numero = IO.readln("Número da conta: ");
        var saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        var novaConta = new ContaBancaria(titular, numero, saldo);

        this.contas.add(novaConta);
    }

    static void main() {

        //coleção para guardar contas bancárias:
        App app = new App();
        app.menu(1);
        //..:: Menu ::..
        // 1 - Cadastrar conta
        // 2 - listar todas contas
        // 3 - Depositar em uma conta
        // 4 - Sacar de uma conta
        // 5 - Sair

        int opcao = 0;
        do{
            IO.println("""
                    ..:: Menu ::..
                    1 - Cadastrar conta
                    2 - listar todas contas
                    3 - Depositar em uma conta
                    4 - Sacar de uma conta
                    5 - Sair
                    """);
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
        } while (opcao != 5);


        //..:: CONTEUDO DA AULA ::..
//        ArrayList<String> lista = new ArrayList<>();
//
//        lista.add("Juca");
//        lista.add("Maria");
//        lista.add("Pedro");
//
//        IO.println(lista.toString());
//
//        //Formas de percorrer as listas do ArrayList:
//
//        for (int i = 0; i < lista.size(); i++) {
//            if (lista.get(i).equals("Maria")){
//                IO.println(lista.get(i));
//            }
//        } // O fori não é muito recomendado
//
//        for (String elemento: lista){
//            if (elemento.equals("Maria")){
//                IO.println(elemento);
//            }
//        }
//
//        //Usando expressão lambda
//        lista.forEach(elemento -> IO.println(elemento));
//
//        lista.forEach(elemento -> {
//            if (elemento.equals("Maria")) {
//                IO.println(elemento);
//            }
//        });
//
//        // method referenca - passar um metodo por referência, com operador ::
//        lista.forEach(IO::println);
//
//        //Remover todas String "Maria"
//        lista.removeIf(e -> e.equals("Maria"));

    }
}
