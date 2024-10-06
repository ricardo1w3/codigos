package carro;

public class Carro {

	private String marca;
	private String nome;

	public Carro(String marca, String nome) {
		this.marca = marca;
		this.nome = nome;
	}

	public void andar() {
		System.out.println("O carro " + marca + " " + nome + " está andando");
	}

	}