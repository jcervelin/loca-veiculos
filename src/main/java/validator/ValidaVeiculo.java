package validator;

import model.Veiculo;

import java.util.Collection;
import java.util.List;

public class ValidaVeiculo {

    private final Collection<Validator> validacoes;

    public ValidaVeiculo(Collection<Validator> validacoes) {
        this.validacoes = validacoes;
    }

    public void validar(Veiculo veiculo) {

        for (Validator validator: validacoes) {
            if (!validator.isValido(veiculo)) {
                throw new RuntimeException(
                        "O veiculo [" + veiculo + "] possui valor [" +
                                validator.getValidacaoType() +
                                "] inválido"
                );
            }
        }
    }

    public void validar(List<Veiculo> veiculos) {
        for (Veiculo veiculo : veiculos) {
            validar(veiculo);
        }
    }


}
