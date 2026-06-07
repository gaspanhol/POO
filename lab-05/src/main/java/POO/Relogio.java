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

        if (horas < 24 && horas >= 0) {
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

        atualizarDisplays();
    }

    public void atualizarDisplays() {
        setHoras();
        setMinutos();
        setSegundos();
    }

    public void atualizarHorario() {
        if (segundos < 59) {
            this.segundos++;
        }   else {
            this.segundos = 0;
            if (minutos < 59) {
                this.minutos++;
            } else  {
                this.minutos = 0;
                if (horas < 23) {
                    this.horas++;
                } else   {
                    this.horas = 0;
                }
            }
        }
        atualizarDisplays();
    }

    private void setHoras() {
        int numeroEsq = this.horas / 10;
        int numeroDir = this.horas % 10;
        displays.get(0).criarNumero(numeroEsq);
        displays.get(1).criarNumero(numeroDir);
    }

    private void setMinutos() {
        int numeroEsq = this.minutos / 10;
        int numeroDir = this.minutos % 10;
        displays.get(2).criarNumero(numeroEsq);
        displays.get(3).criarNumero(numeroDir);
    }

    private void setSegundos() {
        int numeroEsq = this.segundos / 10;
        int numeroDir = this.segundos % 10;
        displays.get(4).criarNumero(numeroEsq);
        displays.get(5).criarNumero(numeroDir);
    }

    public Display getDisplays(int indice) {
        return displays.get(indice);
    }

    public Color getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
