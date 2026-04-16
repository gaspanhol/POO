package POO;

import java.util.ArrayList;

public class Motor {
    private String tipoMotor;
    private boolean ligado = false;

    public Motor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public boolean ligadoDesligado(){
        ligado = !ligado;
        return ligado;
    }

    public boolean isLigado() {
        return ligado;
    }
}

