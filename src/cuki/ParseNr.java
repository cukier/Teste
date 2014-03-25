package cuki;

public class ParseNr {

	public static void main(String[] args) {

		String str = "FEEE4107";
		// String str = "7FFFFFFF";
		// String str = "80000000";
		// long nr = Integer.parseInt(str, 16);
		// long nr = Long.parseLong(str, 16);
		// float nr = Float.parseFloat(str);
		double nr = Double.parseDouble(str);
		System.out.println(nr);
	}
}
