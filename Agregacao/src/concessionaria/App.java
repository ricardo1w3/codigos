package concessionaria;

public class App {
    public static void main(String[] args) {
        Bomba bomba = new Bomba("Gasolina");
        bomba.abastecer(new Carro("Fiat", "Gol")); // O Carro Fiat Gol está sendo abastecido com Gasolina
    }
}