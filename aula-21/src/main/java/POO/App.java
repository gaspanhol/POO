package POO;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

public class App implements DrawListener{

    private Draw draw;

    private ArrayList<CartaGrafica> baralhoGrafico = new ArrayList<>();

    CartaGrafica asOuros = new CartaGrafica(Naipes.OUROS, Valor.AS, 600, 400);

    public App(){
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(0,1200);
        this.draw.setYscale(0,600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);
        // TODO tratamento de excessão, desenhar uma carta através de UTF8 no console se ele não achar a imagem da carta

        int x = 200;
        for (Naipes n : Naipes.values()){
            for (Valor v : Valor.values()) {
                this.baralhoGrafico.add(new CartaGrafica(n,v,x,400));
                x += 20;
            }
        }

        for (CartaGrafica c : baralhoGrafico) {
            c.desenhar(this.draw);
        }

        //Criando cartas gráficas
        asOuros.desenhar(draw);
    }

    @Override
    public void mouseClicked(double x, double y) {
        asOuros.clicouDentro(x,y,draw);
    }

    static void main() {
        App app = new App();

    }
}
