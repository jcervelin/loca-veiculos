package solid;

public class Financeiro {
    // Implementar logica para salario:
    // totalHorasTrabalhadas() * salario por hora
    public static double calcularSalario(Funcionario f) {
        return (f.totalHorasTrabalhadas() * f.getSalarioHora());
    }
    
    // Implementar logica para salario:
    // (horasExtras * (salarioHora * 0.5))
    public static double calcularHoraExtra(Funcionario f) {
        return (f.getHorasExtras() * (f.getSalarioHora() * 0.5));
    }
}
