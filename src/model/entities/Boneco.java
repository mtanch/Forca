package model.entities;

public class Boneco {
	
	public static void print(int parteDoCorpo) {
		
		if (parteDoCorpo == 0) {
			System.out.println(""
					+ "	 ________\n"
					+ "	|        |\n"
					+ "	|\n"
					+ "	|\n"
					+ "	|\n"
					+ "	|\n"
					+ "	|\n"
					+ "________|_________________\n");
		}
		
		if (parteDoCorpo == 1) {
			System.out.println(""
					+ "	 ________\n"
					+ "	|        |\n"
					+ "	|	 O\n"
					+ "	|\n"
					+ "	|\n"
					+ "	|\n"
					+ "	|\n"
					+ "________|_________________\n");
		}
		
		if (parteDoCorpo == 2) {
			System.out.println(""
					+ "	 ________\n"
					+ "	|        |\n"
					+ "	|	 O\n"
					+ "	|	 |\n"
					+ "	|\n"
					+ "	|\n"
					+ "	|\n"
					+ "________|_________________\n");
		}
		
		if (parteDoCorpo == 3) {
			System.out.println(""
					+ "	 ________\n"
					+ "	|        |\n"
					+ "	|	 O\n"
					+ "	|	 |\\\n"
					+ "	|\n"
					+ "	|\n"
					+ "	|\n"
					+ "________|_________________\n");
		}
		
		if (parteDoCorpo == 4) {
			System.out.println(""
					+ "	 ________\n"
					+ "	|        |\n"
					+ "	|	 O\n"
					+ "	|	/|\\\n"
					+ "	|\n"
					+ "	|\n"
					+ "	|\n"
					+ "________|_________________\n");
		}
		
		if (parteDoCorpo == 5) {
			System.out.println(""
					+ "	 ________\n"
					+ "	|        |\n"
					+ "	|	 O\n"
					+ "	|	/|\\\n"
					+ "	|	  \\\n"
					+ "	|\n"
					+ "	|\n"
					+ "________|_________________\n");
		}
		
		if (parteDoCorpo == 6) {
			System.out.println(""
					+ "	 ________\n"
					+ "	|        |\n"
					+ "	|	[X]\n"
					+ "	|	/|\\ [Game Over]\n"
					+ "	|	/ \\\n"
					+ "	|\n"
					+ "	|\n"
					+ "________|_________________\n");
		} 
	}
}
