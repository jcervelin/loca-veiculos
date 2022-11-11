package duvidas.collections;

import model.Bicicleta;
import model.Carro;
import model.Veiculo;

import java.util.List;

public class MainCaracterCuringa {

    public static void main(String[] args) {


        Carro c1 = new Carro("Hot Wheels","Boogie Jolly",2020,5);
        Carro c2 = new Carro("Hot Wheels","Boogie Jolly",2021,5);
        List<Carro> carros = List.of(c1, c2);

        Bicicleta b1 = new Bicicleta("Caloi","MTB",2020,5);
        Bicicleta b2 = new Bicicleta("Caloi","Ceci",2021,5);
        List<Bicicleta> bicicletas = List.of(b1, b2);

        reciclaVeiculos(carros);
        reciclaVeiculos(bicicletas);
    }

    // Caracter Curinga, ou Wildcard, é usado quando quero utilizar minha funcao para receber varios tipos de listas
    // No exemplo abaixo, a funcao reciclaVeiculos aceita listas de todos os tipos que extendem Veiculo.
    // O Caracter curinga pode ser usado em conjunto com tipos genéricos, mas nao é obrigatorio.
    public static void reciclaVeiculos(List<? extends Veiculo> veiculos) {
        System.out.println("Triturando: " + veiculos);
    }
}
