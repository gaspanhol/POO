package POO;

public class Main {
    static void main() {
        Pessoa p = new Pessoa("Wukong", "123.346.234-09","Wukong@example.org");
        IO.println(p.toString());

        Carro c = new Carro("Fusca", 80);

        Carro d = new Carro("gol");


        //OBS: Membros Staticos você não precisa instanciar um objeto, a referência é direto na classe
        //Carro.VEL_MIN;
        //c.VEL_MAX_MODELOS;



    }
}

