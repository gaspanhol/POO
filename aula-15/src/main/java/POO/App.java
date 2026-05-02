package POO;

public class App {
    static void main() {
        Aviao boeing = new Aviao(1000, 900, 500, "Turbina", 6);
        boeing.desligarMotorEspecifico(2);
        IO.println(boeing);
        boeing.ligadoDesligado();
        IO.println(boeing);
        boeing.desligarMotorEspecifico(2);
        IO.println(boeing);
        boeing.ligadoDesligado();
        IO.println(boeing);
    }
}
