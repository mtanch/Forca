package model.entities;

public class LetrasDescobertas {
	private String palavra;
	private boolean[] letrasDescobertas;
	
	public LetrasDescobertas(String palavra) {
		this.palavra = palavra;
		letrasDescobertas = new boolean[this.palavra.length()];
	}

	public String getPalavra() {
		return palavra;
	}

	public void add(int nro) {
		letrasDescobertas[nro] = true;
	}
	
	public void print() {
		
		System.out.print("\n[");
		for (int i = 0 ; i < getPalavra().length() ; i++) {
			if (letrasDescobertas[i] == true) {
				System.out.print(getPalavra().charAt(i));
			} else { 
				System.out.print("_");
			}
		}
		System.out.println("]\n");
	}
	public boolean descobriuPalavra() {
		int count = 0;
		
		for (int i = 0; i < letrasDescobertas.length; i++) {
			if (letrasDescobertas[i] == true) {
				count++;
			}
		}
		
		if (count == letrasDescobertas.length) {
			return true;
		}
		
		return false;
	}
}
