package validator;

import model.Veiculo;

public interface Validator {
    boolean isValido(Veiculo veiculo);

    ValidacaoType getValidacaoType();
}
