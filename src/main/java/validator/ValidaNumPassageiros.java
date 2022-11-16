package validator;

import model.Veiculo;

public class ValidaNumPassageiros implements Validator {

    public boolean isValido(Veiculo veiculo) {
        return veiculo.getNumPassageiros() > 0 && veiculo.getNumPassageiros() < 500;
    }

    @Override
    public ValidacaoType getValidacaoType() {
        return ValidacaoType.NUM_PASSAGEIROS;
    }
}
