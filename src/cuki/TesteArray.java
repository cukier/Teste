package cuki;

import java.util.ArrayList;

public class TesteArray {

	public static void main(String[] args) {

		int inteiro = 55;
		float flutuante = 55.8f;
		Cuki c = new TesteArray().new Cuki();
		ArrayList<Object> lista = new ArrayList<Object>();

		lista.add(inteiro);
		lista.add(flutuante);
		lista.add("Teste");
		lista.add(c);

		for (Object o : lista) {
			if (o instanceof Integer) {
				int aux = (int) o;
				System.out.println(aux + " é um inteiro");
			} else if (o instanceof Float) {
				float aux = (float) o;
				System.out.println(aux + " é um flutuante");
			} else if (o instanceof String) {
				String aux = (String) o;
				System.out.println(aux + " é uma String");
			} else {
				System.out.println(o + " é indefinido");
			}
		}
	}

	public class Cuki {

		public Cuki() {
		}
	}
}