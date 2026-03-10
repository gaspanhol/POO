package poo;

public class Main {
        static void main(String[] args) {

                // Utilizando o metodo Lampada
//              Lampada a = new Lampada();
//              Lampada b = new Lampada();
//
//              a.trocaEstado();
//
//              System.out.println(a.isLigada());
//              System.out.println(b.isLigada());

                //Utilizando metodo Caneta

                Caneta bic = new Caneta();

                bic.setCor("azul");
                bic.setNivelTinta(0.0001);

                String cor = bic.getCor();
                double nivelTinta = bic.getNivelTinta();

                System.out.println(bic.getNivelTinta());
                System.out.println(bic.desenhar(2, 2, 4, 4));
                bic.abrirFechar();
                System.out.println(bic.desenhar(1,1,1,2));
                System.out.println(bic.getNivelTinta());

       }
}
