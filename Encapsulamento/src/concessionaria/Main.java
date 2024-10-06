package concessionaria;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Gol");
		carro.marca = "VW"; 

		/* 
		 * Irá apresentar um erro de compilação, pq marca tá como private
		 * entao só pode ser acessada em public Carro 
		 * */
		
		carro.andar();
	}
}

