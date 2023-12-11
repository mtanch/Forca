package model.application;

import java.util.Scanner;

import model.entities.Forca;
import model.util.enums.Dificuldade;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char dificuldade;
		Forca forca;
		
		System.out.println(""
				+ "	 ________\n"
				+ "	|        |\n"
				+ "	|	 O\n"
				+ "	|	/|\\ [Jogo da Forca]\n"
				+ "	|	/ \\\n"
				+ "	|\n"
				+ "	|	    [F] for respect\n"
				+ "________|_________________\n");
		
		System.out.println();
		System.out.println("Escolha a Dificuldade do jogo:");
		System.out.println("[1] - Fácil");
		System.out.println("[2] - Médio");
		System.out.println("[3] - Difícil");
		
		dificuldade = in.next().charAt(0);
		
		switch(dificuldade) {
		case '1':
			forca = new Forca(Dificuldade.FACIL);
			forca.jogo();
		case '2':
			forca = new Forca(Dificuldade.MEDIO);
			forca.jogo();
		case '3':
			forca = new Forca(Dificuldade.DIFICIL);
			forca.jogo();
		default:
			System.err.println("Escolha uma opção válida.");
			break;	
		}
		
		in.close();
	}

}
