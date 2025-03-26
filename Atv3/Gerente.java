package Atv3;

public class Gerente extends Funcionario{
    Double bonus;

    public Gerente(String nome, Double salarioBase, Double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

   @Override
    public Double calcularSalario() {
        return salarioBase + bonus;
    }
}


