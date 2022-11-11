package validator;

import model.Veiculo;

public class ValidaMarca implements Validator {

    public boolean isValido(Veiculo veiculo) {
        return veiculo.getMarca() != null && !veiculo.getMarca().isBlank();
    }

    @Override
    public ValidacaoType getValidacaoType() {
        return ValidacaoType.MARCA;
    }
}
