package model.util;

import java.util.Random;

import model.util.enums.Dificuldade;

public class PalavraAleatoria {
	
	public int random(Dificuldade dificuldade) {
		Random random = new Random();
		
		int numero = 0;
		
		switch (dificuldade.name()) {
		case "FACIL":
			numero = random.nextInt(40) + 1;
			return numero;

		case "MEDIO":
			numero = random.nextInt(29) + 1;
			return numero;
			
		case "DIFICIL":
			numero = random.nextInt(49) + 1;
			return numero;
		}
		return numero;
	}
	
}
