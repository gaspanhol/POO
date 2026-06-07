package POO;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

public class App {

    private static void desenharRelogio(Draw desenho, Relogio relogio) {

        double fator = 25 * relogio.getTamanho();
        double espacamento = fator * 1.8;
        double ajuste = fator * -0.6;

        double larguraRelogio = espacamento * 5 + fator * 1.1;
        double xInicial = relogio.getX() - larguraRelogio / 2.0;

        for (int i = 0; i < 6; i++) {
            double x = xInicial + i * espacamento;

            desenharDisplay(desenho, relogio.getDisplays(i), x, relogio.getY(), relogio.getTamanho(), relogio.getCor());
        }

        double xDoisPontos1 = xInicial + espacamento * 1.5 - ajuste;
        double xDoisPontos2 = xInicial + espacamento * 3.5 - ajuste;

        desenharDoisPontos(desenho, xDoisPontos1, relogio.getY() - 10, relogio.getCor(), relogio.getTamanho());
        desenharDoisPontos(desenho, xDoisPontos2, relogio.getY() - 10, relogio.getCor(), relogio.getTamanho());
    }

    private static void desenharDoisPontos(Draw desenho, double x, double y, Color cor, int tamanho) {
        double fator = 25 * tamanho;
        desenho.setPenColor(cor);
        desenho.filledCircle(x, y + fator * 1, fator * 0.10);
        desenho.filledCircle(x, y + fator * 2, fator * 0.10);
    }

    private static void desenharDisplay(Draw desenho, Display display, double x, double y, int tamanho, Color corLigada) {

        double fator = 25 * tamanho;
        double fatorCor = 0.2;

        Color corDesligada = new Color(
                (int)(corLigada.getRed() * fatorCor),
                (int)(corLigada.getGreen() * fatorCor),
                (int)(corLigada.getBlue() * fatorCor)
        );

        for (int i = 0; i < 7; i++) {
            boolean ligado = display.getSegmentos(i).isLigado();

            desenho.setPenColor(ligado ? corLigada : corDesligada);

            desenharSegmento(desenho, i, x, y, fator);
        }
    }

    private static void desenharSegmento(Draw desenho, int indice, double x, double y, double fator) {

        switch (indice) {

            case 0 -> desenharHorizontal(desenho, x, y + 2 * fator, fator);

            case 1 -> desenharVertical(desenho, x + fator, y + fator, fator);

            case 2 -> desenharVertical(desenho, x + fator, y, fator);

            case 3 -> desenharHorizontal(desenho, x, y, fator);

            case 4 -> desenharVertical(desenho, x, y, fator);

            case 5 -> desenharVertical(desenho, x, y + fator, fator);

            case 6 -> desenharHorizontal(desenho, x, y + fator, fator);
        }
    }

    private static void desenharHorizontal(Draw desenho, double x, double y, double fator) {

        double[] xs = {
                0.1 * fator + x,
                0.2 * fator + x,
                1.0 * fator + x,
                1.1 * fator + x,
                1.0 * fator + x,
                0.2 * fator + x
        };

        double[] ys = {
                0.2 * fator + y,
                0.3 * fator + y,
                0.3 * fator + y,
                0.2 * fator + y,
                0.1 * fator + y,
                0.1 * fator + y
        };

        desenho.filledPolygon(xs, ys);
    }

    private static void desenharVertical(Draw desenho, double x, double y, double fator) {

        double[] xs = {
                0.1 * fator + x,
                0.2 * fator + x,
                0.2 * fator + x,
                0.1 * fator + x,
                0.0 * fator + x,
                0.0 * fator + x
        };

        double[] ys = {
                0.2 * fator + y,
                0.3 * fator + y,
                1.0 * fator + y,
                1.1 * fator + y,
                1.0 * fator + y,
                0.3 * fator + y
        };

        desenho.filledPolygon(xs, ys);
    }

    public static void main(String[] args) throws Exception {

        int dimensaoX = 1400;
        int dimensaoY = 900;

        Draw desenho = new Draw();

        desenho.setCanvasSize(dimensaoX, dimensaoY);
        desenho.setXscale(0, dimensaoX);
        desenho.setYscale(0, dimensaoY);

        desenho.enableDoubleBuffering();

        Relogio casio = new Relogio(dimensaoX / 2, dimensaoY / 2, 1, Color.RED, 13, 10, 58);

        while (true) {
            desenho.clear(Draw.BLACK);
            desenharRelogio(desenho, casio);
            desenho.show();
            TimeUnit.SECONDS.sleep(1);
            casio.atualizarHorario();
        }
    }
}