package duvidas.liskov;

public class Retangulo implements FormaGeometrica {

    private int altura;
    private int largura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public double getArea() {
        return altura * largura;
    }
}
