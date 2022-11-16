package duvidas.liskov;

public class Circulo implements FormaGeometrica {

    private int raio;

    @Override
    public double getArea() {
        return 3.14 * Math.pow(raio, 2.0);
    }
}
