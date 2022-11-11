package duvidas.collections;

import model.Abastecivel;
import java.util.List;

public class GerenciadorAbastecimento {

    public <T extends Abastecivel> List<T> abastecedor(List<T> abasteciveis) {
        for (Abastecivel a : abasteciveis) {
            a.abastecer();
        }
        return abasteciveis;
    }
}
