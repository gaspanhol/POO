package POO;

import java.awt.*;
import java.util.ArrayList;

public class Relogio {
    private int x;
    private int y;
    private int tamanho;
    private Color cor;
    private int horas;
    private int minutos;
    private int segundos;
    private ArrayList<Display> displays;

    public Relogio(int x, int y, int tamanho, Color cor, int horas, int minutos, int segundos) {
        this.x = x;
        this.y = y;
        this.cor = cor;

        if (tamanho <= 3 && tamanho > 0) {
            this.tamanho = tamanho;
        } else {
            this.tamanho = 2;
        }

        if (horas <= 24 && horas >= 0) {
            this.horas = horas;
        } else {
            this.horas = 0;
        }

        if (minutos < 60 && minutos >= 0) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }

        if (segundos < 60 && segundos >= 0) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }

        this.displays = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            this.displays.add(new Display());
        }
    }

    public void desenhar() {

    }

    public void atualizarHorario() {

    }

}
