package POO;

public class Main {
    static void main() {

        Horario h = new Horario(23,59,59);
        IO.println(h.toString());
        IO.println(h.tempoPorExtenso());

    }
}
