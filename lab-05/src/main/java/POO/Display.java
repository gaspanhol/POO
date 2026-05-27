package POO;

import java.util.ArrayList;

public class Display {
    private ArrayList<Segmento> segmentos;

    public Display() {
        this.segmentos = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            this.segmentos.add(new Segmento());
        }
    }

    public void criarNumero(int numero) {
        apagarSegmentos();
        switch (numero) {
            case 0 -> ligarSegmentos(new int[]{0,1,2,3,4,5});
            case 1 -> ligarSegmentos(new int[]{1,2,});
            case 2 -> ligarSegmentos(new int[]{0,1,6,4,3});
            case 3 -> ligarSegmentos(new int[]{0,1,6,2,3});
            case 4 -> ligarSegmentos(new int[]{5,6,1,2});
            case 5 -> ligarSegmentos(new int[]{0,5,6,2,3});
            case 6 -> ligarSegmentos(new int[]{0,5,4,3,2,6});
            case 7 -> ligarSegmentos(new int[]{0,1,2});
            case 8 -> ligarSegmentos(new int[]{0,1,2,3,4,5,6});
            case 9 -> ligarSegmentos(new int[]{0,1,2,3,5,6});
        }
    }

    private void apagarSegmentos() {
        for (Segmento s : segmentos){
            s.desligar();
        }
    }

    private void ligarSegmentos(int[] indices) {
        for (int i : indices) {
            segmentos.get(i).ligar();
        }
    }
}
