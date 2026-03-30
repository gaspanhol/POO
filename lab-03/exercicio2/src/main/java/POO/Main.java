package POO;

public class Main {
    static void main() {

        Horario h = new Horario(1,1,5);
        Horario a = new Horario(2,0,4);
        IO.println(h.toString());
        IO.println(h.tempoPorExtenso());
        IO.println(h.horarioEmSegundos());
        IO.println(a.diferencaHorarios(h));
    }
}
