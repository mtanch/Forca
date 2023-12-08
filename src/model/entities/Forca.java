package model.entities;

import java.util.Scanner;

import model.util.PalavraAleatoria;
import model.util.Palavras;
import model.util.enums.Dificuldade;

public class Forca {
	
	private Dificuldade dificuldade;
	private String palavra;
	
	public Forca() {
	}
	
	public Forca(Dificuldade dificuldade) {
		this.dificuldade = dificuldade;
		this.palavra = new Palavras().palavra(dificuldade, new PalavraAleatoria().random(dificuldade));
	}
	
	public Dificuldade getDificuldade() {
		return dificuldade;
	}

	public String jogo() {
		Scanner in = new Scanner(System.in);
		
		boolean descobriuPalavra = false;
		int tentativa = 0;
		
		while(descobriuPalavra == false) {
			
			tentativa++;
			
			System.out.println("Escolha uma opção:");
			System.out.println("Chutar uma letra");
			System.out.println("Chutar uma palavra;");
			
			char escolha = in.next().toLowerCase().charAt(0);
			
			switch (escolha) {
			case 'l':
				System.out.print("Escolha uma letra: ");
				char letra = in.next().toLowerCase().charAt(0);
				
				boolean encontrouLetra = false;
				for (int i = 0; i < this.palavra.length(); i++) {
					
					if (letra == this.palavra.charAt(i)) {
						encontrouLetra = true;
					}
				}
				
				break;

			case 'p':
				System.out.print("Chute uma palavra: ");
				char chute = in.next().toLowerCase().charAt(0);
				break;
			}
			
			
			
			
//			if () {
//				
//			}
			
			if (tentativa == 6 && descobriuPalavra == false) {
				return "Você não descobriu a palavra. A resposta correta era [" + this.palavra + "]";
			}
			
		}
		
		in.close();
		return "Você encontrou a palavra!!!";
	}
}
