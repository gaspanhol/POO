package POO;

import java.util.ArrayList;

    public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private int maxCombustivel;
    private boolean ligadoDesligado = false;
    private ArrayList<Motor> motores;

    public Aviao(int maxTripulantes, int maxPassageiros, int maxCombustivel, String tipoMotor, int numMotor) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.motores = new ArrayList<>();
        if (tipoMotor.equals("Hélice") || tipoMotor.equals("Turbina")) {
            if (numMotor <= 8 && numMotor > 0) {
                for (int i = 0; i < numMotor; i++) {
                    motores.add(new Motor(tipoMotor));
                }
            }
        }
    }

    public boolean ligadoDesligado() {
        if (!ligadoDesligado){
            this.motores.forEach(motor -> {
                if (!motor.isLigado()){
                    motor.ligadoDesligado();
                }
            });
        } else {
            this.motores.forEach(motor -> {
                if (motor.isLigado()){
                    motor.ligadoDesligado();
                }
            });
        }
            ligadoDesligado = !ligadoDesligado;
            return ligadoDesligado;
    }

    public boolean desligarMotorEspecifico(int numeroMotor){
        int numeroAdaptado = numeroMotor -1;
        if (numeroAdaptado < motores.size() && numeroAdaptado >= 0) {
            this.motores.forEach(motor -> {
                if (motores.get(numeroAdaptado) == motor) {
                    motor.ligadoDesligado();
                    return;
                }
            });
            return true;
        } else {
            return false;
        }
    }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Avião:").append("\n");
            sb.append("Numero máximo de tripulantes= ").append(maxTripulantes).append("\n");
            sb.append("Numero máximo de passageiros= ").append(maxPassageiros).append("\n");
            sb.append("Maximo de Combustivel= ").append(maxCombustivel).append(" L\n");
            sb.append("Avião ligado= ").append(ligadoDesligado).append("\n");
            sb.append("motores= ").append(motores);
            return sb.toString();
        }
    }

