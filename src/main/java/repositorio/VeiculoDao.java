package repositorio;

import model.Veiculo;

import java.util.*;

public class VeiculoDao implements BaseDao<Veiculo, String> {

    private static Map<String, Veiculo> VEICULOS = new HashMap<>();

    @Override
    public void salvar(Veiculo element) {
        element.setId(UUID.randomUUID().toString());
        VEICULOS.put(element.getId(), element);
    }

    @Override
    public Collection<Veiculo> listar() {
        return VEICULOS.values();
    }

    @Override
    public Veiculo buscarPorId(String id) {
        return VEICULOS.get(id);
    }
}
