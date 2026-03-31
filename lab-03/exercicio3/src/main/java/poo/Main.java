package poo;

public class Main {
    static void main() {
        Retangulo r = new Retangulo();
        IO.println(r.getAltura());
        IO.println(r.setAltura(5));
        IO.println(r.getAltura());

        IO.println(r.getLargura());
        IO.println(r.setLargura(7));
        IO.println(r.getLargura());

        IO.println(r.getCodif());
        IO.println(r.setCodif("UTF8"));
        IO.println(r.getCodif());

        IO.println("Area = " + r.areaRetangulo());

        IO.println("Perimetro = " + r.perimtroRetangulo());

        IO.println(r.toString());


    }
}
