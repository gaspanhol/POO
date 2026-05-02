package POO.Livro;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Autor autor;
    private ArrayList<Capitulo> capitulos;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    public void adicionaCapitulo(String titulo) {
        var cap = new Capitulo(titulo);
        capitulos.add(cap);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();

        this.capitulos.forEach(sb::append);

        return String.format("""
                Livro: %s
                Autor: %n%s
                Capítulos: %n%s
                """, titulo, autor, sb.toString());
    }
}
