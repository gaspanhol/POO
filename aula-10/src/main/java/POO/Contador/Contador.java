package POO.Contador;

public class Contador {

    //Atributos
    private int valorAtual;

    //Métodos
    public int valor(int valor){
        valorAtual = valor;
        return valorAtual;
    }

    public void incrementar(){
        valorAtual += 1;
    }

    public int valorContador(){
        return valorAtual;
    }



}
