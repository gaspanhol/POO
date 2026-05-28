package poo;

public class App {
    static void main() {
        Disciplina poo = new Disciplina("POO", new DiasDaSemana[]{DiasDaSemana.TERCA,DiasDaSemana.QUINTA});

        // Banco de dados: int
        // Interface com o usuário: segunda-feira

        String sigla = IO.readln("Digite a sigla da disciplina: ");
        int diaUm = Integer.parseInt(IO.readln("Digite os dias da semana (1 = domingo; 2 = segunda; 3 = terça; 4 = quarta; 5 = quinta; 6 = sexta; 7 = sabado: "));
        int diaDois = Integer.parseInt(IO.readln("Digite os dias da semana (1 = domingo; 2 = segunda; 3 = terça; 4 = quarta; 5 = quinta; 6 = sexta; 7 = sabado: "));

        Disciplina disciplina = new Disciplina(sigla, new DiasDaSemana[]{DiasDaSemana.getByCodigo(diaUm), DiasDaSemana.getByCodigo(diaDois)});

        IO.println(disciplina);

    }
}
