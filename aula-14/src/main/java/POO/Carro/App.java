package POO.Carro;

public class App {
        static void main() {
            Motor motor = new Motor("T200");
            Motor v8 = new Motor("Ford Coyote");
            Carro fusca = new Carro("vw", motor);
            IO.println("Giro atual do motor: " + fusca.getGiroAtual());
            fusca.acelerar(10);
            IO.println("Giro atual do motor: " + fusca.getGiroAtual());
            IO.println(fusca);
            fusca.trocarMotor(v8);
            IO.println(fusca);
            fusca = null;
            IO.println(fusca);
            IO.println(motor);
        }
}
