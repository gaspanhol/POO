package POO;

public class Main {
    static void main() {

        Ponto a = new Ponto (1,2);
        Ponto b = new Ponto (3,4);

        double distancia = a.distanciaEntrePontos(b);
        IO.println(String.format("A distância entre os dois pontos é de %.2f", distancia));

    }
}
