package Atv3;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public Double calcularSalario() {
        return salarioBase * 1.10;  // Aumento de 10%
    }
}

