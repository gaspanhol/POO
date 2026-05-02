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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n").append("tipoMotor= ").append(tipoMotor);
        sb.append(", ligado= ").append(ligado).append("\n");
        return sb.toString();
    }
}

