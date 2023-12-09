package model.util;

import java.util.Random;

import model.util.enums.Dificuldade;

public class PalavraAleatoria {
	
	public int random(Dificuldade dificuldade) {
		Random random = new Random();
		
		int numero = 0;
		
		switch (dificuldade.name()) {
		case "FACIL":
			numero = random.nextInt(41) + 1;
			return numero;

		case "MEDIO":
			numero = random.nextInt(30);
			return numero;
			
		case "DIFICIL":
			numero = random.nextInt(50) + 1;
			return numero;
		}
		return numero;
	}
	
}
