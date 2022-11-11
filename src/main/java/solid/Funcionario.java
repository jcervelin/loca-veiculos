package solid;

import lombok.Data;
import solid.entity.FuncionarioEntity;

// Definicao de horas trabalhadas = horas diarias (max 8 horas por dia) + horas extras

@Data
public class Funcionario {

    private static final int MAX_HORAS_DIARIAS = 8;

    private static FuncionaroRepository repo;

    private String id;
    private String nome;
    private int horasDiarias;
    private int horasExtras;
    private double salarioHora;

    public int totalHorasTrabalhadas () {
        return horasDiarias + horasExtras;
    }

    // valor incluido superior a 8 é calculado como hora extra
    // valor incluido inferior a 8, a diferenca deverá ser descontada
    // é chamado uma vez ao dia
    public void incluirHorasDiarias(int horas) {

    }

    // Implementar logica para salario:
    // totalHorasTrabalhadas() * salario por hora
    public double calcularSalario() {
        return -1;
    }

    // Implementar logica para salario:
    // (horasExtras * (salarioHora * 0.5))
    public double calcularHoraExtra() {
        return -1;
    }

    // as horas reportadas sao horasDiarias + horasExtras
    public int reportarHorasTrabalhadas() {
        return -1;
    }

    public void save(Funcionario funcionario) {
        // converte funcionario para funcionarioEntity
        FuncionarioEntity entity = new FuncionarioEntity();
        entity.setId(funcionario.getId());
        repo.save(entity);
    }
}
