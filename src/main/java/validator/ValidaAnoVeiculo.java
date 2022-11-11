package validator;

import model.Veiculo;

import java.time.Year;

public class ValidaAnoVeiculo implements Validator {


    public boolean isValido(Veiculo veiculo) {
        final int ano = veiculo.getAno();
        return ano > 1960 && ano <= Year.now().plusYears(1).getValue();

    }

    @Override
    public ValidacaoType getValidacaoType() {
        return ValidacaoType.ANO;
    }


}
