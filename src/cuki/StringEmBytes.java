package cuki;

import java.util.ArrayList;

public class StringEmBytes {

	public static void main(String[] args) {

		String str = "Pivo Krebsfer";

		ArrayList<Integer> list = new ArrayList<Integer>();

		int aux = 0;
		for (int i = 0; i < str.length(); i += 2) {
			aux = 0;
			if (i < str.length() - 1)
				aux = ((int) str.toCharArray()[i + 1] & 0xFF) << 8;
			aux |= ((int) str.toCharArray()[i] & 0xFF);
			list.add(aux);
		}

		int[] resp = new int[list.size()];

		for (int i = 0; i < resp.length; ++i) {
			resp[i] = (int) list.get(i);
		}

		for (int i : resp)
			System.out.println(i);
	}
}
