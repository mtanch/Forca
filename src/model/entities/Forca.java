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
		int tentativa = 0;
		int count = 0;

		LetrasDescobertas ld = new LetrasDescobertas(getPalavra());

		while (descobriuPalavra == false) {

			if (acertouLetra == false) {
				tentativa++;
			}

			acertouLetra = false;
			
			System.out.println("\n[" + tentativa + "ª tentativa.]\n");

			System.out.println("Letra ou palavra? (l/p)");

			char escolha = in.next().toLowerCase().charAt(0);

			switch (escolha) {
			case 'l':
				ld.print();

				System.out.print("Escolha uma letra: ");
				char letra = in.next().toLowerCase().charAt(0);

				for (int i = 0; i < getPalavra().length(); i++) {

					if (letra == getPalavra().charAt(i)) {
						count++;
						ld.add(i);
						acertouLetra = true;
					}
				}

				System.out.println("Você acertou [" + count + "] letra(s)!");
				count = 0;

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
								+ "\n"
								+ "\n[Fim de Jogo]");
					}
					System.exit(0);
					break;
				case 'n':
					break;
				}

			default:
				System.err.println("Escolha uma opção válida.");
				break;
			}

			if (tentativa == 6 && descobriuPalavra == false) {
				System.out.println("Você não descobriu a palavra.\n" + "\nA resposta correta era [" + getPalavra() + "].");
				System.exit(0);
			} else if (ld.descobriuPalavra() == true) {
				descobriuPalavra = true;
			}

		}
		System.out.println("Você encontrou a palavra!!!" + "\n[" + getPalavra() + "]");
	}

}
