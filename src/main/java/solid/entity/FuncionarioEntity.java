package solid.entity;

import lombok.Data;

@Data
public class FuncionarioEntity {

    private String id;
    private String nome;
    private int horasDiarias;
    private int horasExtras;
    private double salarioHora;

}
