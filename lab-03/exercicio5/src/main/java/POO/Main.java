package POO;

public class Main {
    static void main() {
        Robo r1 = new Robo("WALL-E");
        Robo r2 = new Robo("AVA");
        Robo r3 = new Robo("BB8");

        IO.println(r1.toString());
        IO.println(r2.toString());
        IO.println(r3.toString());
        IO.println(Robo.getTotalRobos());
    }
}
