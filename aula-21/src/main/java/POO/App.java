package POO;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class App implements DrawListener{

    private Draw draw;
    CartaGrafica asOuros = new CartaGrafica(Naipes.OUROS, Valor.AS, 600, 400);

    public App(){
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(0,1200);
        this.draw.setYscale(0,600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this); // tratamento de excessão, desenhar uma carta através de UTF8 no console se ele não achar a imagem da carta

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
