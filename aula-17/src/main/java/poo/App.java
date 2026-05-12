package poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class App {
    static void main() throws InterruptedException {

        Draw draw = new Draw();
        //draw.circle(.5,.5,.3);

        //Definir escala do desenho
        draw.setYscale(0,800);
        draw.setXscale(0,800);

        // Realizar o desenho em segundo plano
        draw.enableDoubleBuffering();

        //Cor do simbolo
        draw.setPenColor(Color.blue);

        //Desenho de Circulo
        //draw.circle(400,400,100);
        //draw.filledCircle(400,400,50);

        //Desenho de retangulo
        //draw.filledRectangle(400,500,200,250);

        //Desenho de poligono
        //double[] x = {100,150,250,300};
        //double[] y = {100,150,150,100};
        //draw.filledPolygon(x,y);

        //Desenho para forçar o sistema
//        for (int i = 0; i < 800; i+=5) {
//            draw.line(i, 0, i, 800);
//            draw.line(0, i, 800, i);
//        }
//        draw.show();

        //Escrevendo texto na interface grafica
//        draw.setFontSize(30);
//        draw.text(400,400,"POO");
//        draw.show();

        //Contador na interface grafica
//        draw.setFontSize(30);
//        for (int i = 0; i < 10; i++) {
//            draw.clear();
//            draw.text(400,400,"" + i);
//            draw.show();
//            TimeUnit.SECONDS.sleep(1);
//        }
//        draw.clear();
        draw.filledCircle(350,300,50);
        draw.filledCircle(450,300,50);
        double[] x = {10,10,100};
        double[] y = {10,10,100};
        draw.filledPolygon(x,y);
        draw.show();

    }
}
