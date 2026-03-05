package poo;

public class Main {
        static void main(String[] args) {

                Lampada a = new Lampada();
                Lampada b = new Lampada();

                a.trocaEstado();

                System.out.println(a.isLigada());
                System.out.println(b.isLigada());

        }
}
