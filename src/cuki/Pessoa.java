package cuki;

public class Pessoa {

	private String nome = "nomePadrao";
	private int idade = 99;

	public Pessoa() {
		System.out.println("Nasceu " + nome);
	}

	public Pessoa(String nomeDado) {
		super();
		nome = nomeDado;
	}

	public Pessoa(int idadeDada) {
		idade = idadeDada;
	}

	public Pessoa(String nomeDado, int idadeDada) {
		nome = nomeDado;
		idade = idadeDada;
	}

	public void dizHello() {
		System.out.println("Ola, meu nome é " + nome + "\n e eu tenho " + idade
				+ " anos de idade");
	}

}
