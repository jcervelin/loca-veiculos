package solid;

public class RH {

    // as horas reportadas sao horasDiarias + horasExtras
    public static int reportarHorasTrabalhadas(Funcionario f) {
        return f.getHorasDiarias() + f.getHorasExtras();
    }

    // report numero de horas extra trabalhado
    public static double calcularHoraExtra(Funcionario f) {
        return f.getHorasExtras();
    }
}
