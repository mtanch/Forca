package model.entities;

//	TODO AJEITAR A LÓGICA PARA LETRAS REPETIDAS NO GAME

import java.util.Scanner;

import model.util.FormatarString;
import model.util.LimpaTela;
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

	public String getPalavra() {
		return palavra.toLowerCase();
	}

	public Dificuldade getDificuldade() {
		return dificuldade;
	}

	public void jogo() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		boolean descobriuPalavra = false;
		boolean acertouLetra = false;
		boolean errouEscolha = false;
		
		int fase = 0;
		int letrasAcertadas = 0;

		LetrasDescobertas ld = new LetrasDescobertas(getPalavra());
		
		ld.print();

		while (descobriuPalavra == false) {

			errouEscolha = false;
			acertouLetra = false;

			Boneco.print(fase);
			
			System.out.println("\n[" + (fase + 1) + "ª fase.]\n");
			System.out.println("Letra ou palavra? (l/p)");

			char escolha = in.next().toLowerCase().charAt(0);

			switch (escolha) {
			case 'l':

				System.out.print("Escolha uma letra: ");
				char letra = in.next().toLowerCase().charAt(0);

				for (int i = 0; i < getPalavra().length(); i++) {

					if (letra == FormatarString.removerAcentos(getPalavra()).charAt(i)) {
						letrasAcertadas++;
						ld.add(i);
						acertouLetra = true;
						Boneco.print(fase);
					}
				}

				LimpaTela.print();
				
				System.out.println("Você acertou [" + letrasAcertadas + "] letra(s)!");
				letrasAcertadas = 0;
				
				ld.print();
				break;

			case 'p':

				System.out.println("Você só pode chutar a palavra uma unica vez.");
				System.out.println("Tem certeza que deseja continuar? (s/n)");

				escolha = in.next().toLowerCase().charAt(0);
				in.nextLine(); // Limpeza de Buffering

				switch (escolha) {
				case 's':
					System.out.print("Chute uma palavra: ");
					String chute = in.nextLine().toLowerCase();

					if (chute.equals(getPalavra())) {
						System.out.println("Você acertou a palavra!!!");
					} else {
						System.out.println("Você errou."
								+ "\nA palavra era [" + getPalavra() + "]"
								+ "\n"
								+ "\n"
								+ "[Fim de Jogo]");
					}
					System.exit(0);
					break;
				case 'n':
					errouEscolha = true;
					break;
				}

			default:
				System.err.println("Escolha uma opção válida.");
				errouEscolha = true;
				break;
			}

			if (fase == 5 && acertouLetra == false) {
				fase++;
				Boneco.print(fase);
				
				System.out.println("Você não descobriu a palavra.\n"
								+ "\nA resposta correta era [" + getPalavra() + "].");
				System.exit(0);
			} else if (ld.descobriuPalavra() == true) {
				descobriuPalavra = true;
			}
			
			if (acertouLetra == false && errouEscolha == false) {
				fase++;
			}
		}
		Boneco.print(fase);
		
		System.out.println("Você encontrou a palavra [" + getPalavra() + "] !!!");
		System.exit(0);
	}

}
