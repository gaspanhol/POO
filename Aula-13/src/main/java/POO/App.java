package POO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.ImagingOpException;
import java.util.ArrayList;
import java.util.HashMap;

public class App {

    private HashMap<String, Livro> livros;

    public App(){
        this.livros = new HashMap<>();
        Livro a = new Livro("1","Duna","Frank",1980);
        this.livros.put("1", a);
        Livro b = new Livro("2","Messias de Duna","Frank",1982);
        this.livros.put("2", b);
        Livro c = new Livro("3","Filhos de Duna","Frank",1984);
        this.livros.put("3", c);
        Livro d = new Livro("4","Imperador deus de Duna","Frank",1986);
        this.livros.put("4", d);
    }

    void menu(int opcao){
        switch (opcao) {
            case 1 -> {cadastrar();}
            case 2 -> {listarLivros();}
            case 3 -> {listarPorAno();}
            case 4 -> {alterarDados();}
            case 5 -> {}
            default -> {IO.println("Número inválido");}
        }
    }

    void cadastrar(){
        var ISBN = IO.readln("Digite o número do ISBN: ");
        var titulo = IO.readln("Digite o titulo do livro: ");
        var autor = IO.readln("Digite o autor do livro: ");
        var ano = Integer.parseInt(IO.readln("Digite o ano de publicação: "));
        var novoLivro = new Livro(ISBN, titulo, autor, ano);
        this.livros.put(ISBN, novoLivro);
        IO.println("Livro adicionado ao acervo");
    }

    void listarLivros() {
        livros.forEach((ISBN, valor) -> {
            IO.println(valor);
            IO.println("----------------------------------------");
        });
    }

    void listarPorAno(){
        livros.forEach((ano, valor) -> {
            IO.println(valor);
            IO.println("----------------------------------------");
        });
    }

    void alterarDados() {

    }

    static void main() {
        //Sistema de uma livraria para gestão do acervo da lista
//        1 - Cadastrar Livro
//        2 - listar todos os livros
//        3 - listar todos os livros publicados em um ano específico
//        4 - Alterar dados de um livro
//        5 - sair

        App app = new App();

        int opcao = 0;
        do{
            IO.println("""
                    ..:: Menu ::..
                    1 - Cadastrar Livro
                    2 - listar todos os livros
                    3 - listar todos os livros publicados em um ano específico
                    4 - Alterar dados de um livro
                    5 - sair
                    """);
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
            app.menu(opcao);
        } while (opcao != 5);

    }
}
