package poo;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList <Pessoa> pessoas;
    private ArrayList <Livro> livros;

    public Biblioteca(String nome, ArrayList<Livro> livros) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.pessoas = new ArrayList<>();
    }

    public boolean adicionarLivro (Livro livro) {
        livros.add(livro);
        return true;
    }

    public boolean adicionarPessoa (Pessoa pessoa) {
        pessoas.add(pessoa);
        return true;
    }

    public void devolverLivro(String ISBN, Pessoa pessoa) throws BibliotecaException{
        for (Livro livro : livros) {
            if (livro.getISBN().equals(ISBN)) {
                if (!livro.isEmprestado()) {
                    throw new TentativaEmprestimoException("O livro não foi emprestado");
                } else {
                    if(pessoa.getLivrosEmprestados() < 1) {
                        throw new LimiteEmprestimoException("Usuário sem livros emprestados");
                    } else {
                        pessoa.setLivrosEmprestados(pessoa.getLivrosEmprestados() - 1);
                        livro.setEmprestado(false);
                        IO.println("Livro devolvido-");
                    }
                }
            } else {
                IO.println("Livro não encontrado");
            }
        }
    }

    public void emprestarLivro(String ISBN, Pessoa pessoa) throws BibliotecaException{
        for (Livro livro : livros) {
            if (livro.getISBN().equals(ISBN)) {
                if (livro.isEmprestado()) {
                    throw new TentativaEmprestimoException("O livro já está emprestado");
                } else {
                    if(pessoa.getLivrosEmprestados() >= 3) {
                        throw new LimiteEmprestimoException("Máximo de emprestimos atingido");
                    } else {
                        pessoa.setLivrosEmprestados(pessoa.getLivrosEmprestados() + 1);
                        livro.setEmprestado(true);
                        IO.println("Livro emprestado");
                    }
                }
            } else {
                IO.println("Livro não encontrado");
            }
        }
    }

}
