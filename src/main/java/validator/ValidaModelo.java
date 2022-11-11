package validator;

import model.Veiculo;

public class ValidaModelo implements Validator {

    public boolean isValido(Veiculo veiculo) {
        return veiculo.getModelo() != null && !veiculo.getModelo().isBlank();
    }

    @Override
    public ValidacaoType getValidacaoType() {
        return ValidacaoType.MODELO;
    }
}
