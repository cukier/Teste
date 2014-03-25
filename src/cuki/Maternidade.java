package cuki;

import cuki.Pessoa;

public class Maternidade {

	public static void main(String[] args) {

		Contador c1 = new Contador();
		c1.imprime();
		c1.incrementa1();
		c1.incrementa2();
		c1.imprime();

		System.out.println("");

		Contador c2 = new Contador();
		c2.imprime();
		c2.incrementa1();
		c2.incrementa2();
		c2.imprime();

		// Pessoa joao = new Pessoa("Joao", 32);

		// Pessoa.dizHello();
		// System.out.println(Pessoa);
		// new Pessoa("Joao", 23);
		// joao.dizHello();
		// System.out.println(joao);
		// new Pessoa("Cuki", 44);
		// joao.dizHello();
		// System.out.println(joao);

	}
}
