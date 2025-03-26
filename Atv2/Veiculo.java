package Atv2;

public class Veiculo {
    public void mover() {
        System.out.println("O veículo está se movendo");
    }
}

class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo rapidamente");
    }
}