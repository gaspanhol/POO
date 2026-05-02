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
        Livro e = new Livro("5","BlaBlaCar","Jorge",1986);
        this.livros.put("5", e);
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
        if(livros.containsKey(ISBN)){
            IO.println("ISBN já cadastrado");
        } else {
            var titulo = IO.readln("Digite o titulo do livro: ");
            var autor = IO.readln("Digite o autor do livro: ");
            var ano = Integer.parseInt(IO.readln("Digite o ano de publicação: "));
            var novoLivro = new Livro(ISBN, titulo, autor, ano);
            this.livros.put(ISBN, novoLivro);
            IO.println("Livro adicionado ao acervo");
        }
    }

    void listarLivros() {
        livros.forEach((ISBN, valor) -> {
            IO.println(valor);
            IO.println("----------------------------------------");
        });
    }

    void listarPorAno(){
        int anoEscolhido = Integer.parseInt(IO.readln("Digite o ano para ver a lista de livros publicados nele: "));
        this.livros.forEach((ISBN, livro) -> {
            if (livro.getAno() == anoEscolhido) {
                IO.println(livro);
                IO.println("----------------------------------------");
            }
        });
    }

    void alterarDados() {
        var livroEscolhido = IO.readln("Digite o ISBN do livro que você deseja alterar os dados: ");
        Livro livro = livros.get(livroEscolhido);
        if (livro == null) {
            IO.println("Livro não encontrado.");
            return;
        } else {
            IO.println("voce selecionou o livro: " + livro.getTitulo() + "\n");
        }
        int opcao = 0;
        do{
            IO.println("""
                    Escolha o dado que deseja alterar
                    1 - Alterar Titulo do livro
                    2 - Alterar Autor do livro
                    3 - Alterar ano de publicação do livro
                    """);
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
        } while (opcao > 3 || opcao < 1);
        if (opcao == 1) {
            livro.setTitulo(IO.readln("Entre com o titulo: "));
        } else if (opcao == 2) {
            livro.setAutor(IO.readln("Entre com o autor: "));
        } else {
            livro.setAno(Integer.parseInt(IO.readln("Entre com o ano: ")));
        }

        IO.println("Dados alterados com sucesso!");
    }


    public static void main(String[] args) {
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
