package Atv3;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Jason", 2000.0);
        Gerente gerente = new Gerente("Bruce", 3000.0, 500.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alfred", 2500.0);

        System.out.println("Salário do Funcionario: " + funcionario.calcularSalario());
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
        System.out.println("Salário do Desenvolvedor: " + desenvolvedor.calcularSalario());
    }
}

