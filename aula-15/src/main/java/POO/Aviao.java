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
            this.motores.forEach(motor -> {
               if (motor.isLigado()){
                   motor.ligadoDesligado();
               }
            });
            ligadoDesligado = !ligadoDesligado;
            return ligadoDesligado;
    }


        @Override
        public String toString() {
            return "Aviao{" +
                    "maxTripulantes=" + maxTripulantes +
                    ", maxPassageiros=" + maxPassageiros +
                    ", maxCombustivel=" + maxCombustivel +
                    ", ligadoDesligado=" + ligadoDesligado +
                    '}';
        }
    }
