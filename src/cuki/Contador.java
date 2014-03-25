package cuki;

public class Contador {

	private static int contador;
	private int contador2;

	public static void incrementa1() {
		contador++;
	}

	public void incrementa2() {
		contador2++;
	}

	public void imprime() {
		System.out.println("con1: " + contador + "\ncon2: " + contador2);
	}

}
