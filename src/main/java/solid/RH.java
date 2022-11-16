package solid;

public class RH {

    // as horas reportadas sao horasDiarias + horasExtras
    public int reportarHorasTrabalhadas(Funcionario f) {
        return f.getHorasDiarias() + f.getHorasExtras();
    }

    // report numero de horas extra trabalhado
    public double calcularHoraExtra(Funcionario f) {
        return f.getHorasExtras();
    }
}
