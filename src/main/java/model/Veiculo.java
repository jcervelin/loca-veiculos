package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Veiculo {

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Veiculo(String marca, String modelo, int ano, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.numPassageiros = numPassageiros;
    }

    private String id;

    private String marca;
    private String modelo;
    private int ano;
    private int numPassageiros;

    abstract void locomover();
}
