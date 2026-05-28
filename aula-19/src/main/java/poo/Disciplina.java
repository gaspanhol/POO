package poo;

import java.util.Arrays;

public class Disciplina {
    
    private String sigla;
    private DiasDaSemana[] aulas;

    public Disciplina(String sigla, DiasDaSemana[] aulas) {
        this.sigla = sigla;
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Sigla: " + sigla + "\n" +
                "Dias com aulas: " + Arrays.toString(aulas) + "\n";
    }
}
