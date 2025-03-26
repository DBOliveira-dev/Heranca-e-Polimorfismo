package Atv3;

public class Funcionario {
    String nome;
    Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario() {
        return salarioBase;
    }
}
