package duvidas.liskov;

public class Quadrado implements FormaGeometrica {

    private int lado;

    @Override
    public double getArea() {
        return lado * lado;
    }
}
