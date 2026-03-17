package POO;

public class Carro {
    // Atributos
    private String modelo;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    private static final int VEL_MAX_MODELOS = 300; //Constante
    private static final int VEL_MIN = 0; //Constante //Static serve para definir que essa variavel é absoluta e não precisa alocar memória em cada carro criado

    public Carro(String modelo, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeMaxima = VEL_MAX_MODELOS; //ToDo arrumar a classe para não passar de 300KM por hora
        this.velocidadeAtual = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void acelerar (int aumentarVelocidade){
        velocidadeAtual = (velocidadeAtual+aumentarVelocidade < velocidadeMaxima) ? velocidadeAtual+aumentarVelocidade : velocidadeMaxima;
    }

    public void frear(int diminuirVelocidade){
        velocidadeAtual = (velocidadeAtual-diminuirVelocidade > VEL_MIN) ? velocidadeAtual-diminuirVelocidade : VEL_MIN;
    }

}
