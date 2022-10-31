package model;

public class Carro extends Veiculo implements Abastecivel, Comparable<Carro> {
// DTO
    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, int numPassageiros) {
        super(marca, modelo, ano, numPassageiros);
    }

    @Override
    public void abastecer() {

    }

    @Override
    public void locomover() {

    }

    @Override
    public int compareTo(Carro outro) {
        if (this.getMarca() == null) {
             return 1;
        }

        if (outro.getMarca() == null) {
            return -1;
        }
//1 2 3 4 5
//5 4 3 2 1
        return this.getMarca().compareTo(outro.getMarca());
    }

    // Comparable
    // List
    // Closeable
    // Iterable
    // Collection

}
