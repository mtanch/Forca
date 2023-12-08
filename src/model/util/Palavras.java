package model.util;

import model.util.enums.Dificuldade;

public class Palavras {
	private String[] facil = new String[] {"Amarelo", "Amiga", "Amor", "Ave", "Avião", "Avó", "Balão", "Bebê", "Bolo", "Branco", "Cama", "Caneca", "Celular", "Céu", "Clube", "Copo", "Doce", "Elefante", "Escola", "Estojo", "Faca", "Foto", "Garfo", "Geleia", "Girafa", "Janela", "Limonada", "Mãe", "Meia", "Noite", "Óculos", "ônibus", "Ovo", "Pai", "Pão", "Parque", "Passarinho", "Peixe", "Pijama", "Rato", "Umbigo"};
	// 41 Palavras de dificuldade fácil
	
	private String[] medio = new String[] {"Afobado", "Amendoim", "Banheiro", "Caatinga", "Cachorro", "Campeonato", "Capricórnio", "Catapora", "Corrupção", "Crepúsculo", "Empenhado", "Esparadrapo", "Forca", "Galáxia", "História", "Magenta", "Manjericão", "Menta", "Moeda", "Oração", "Paçoca", "Palavra", "Pedreiro", "Pneumonia", "Pulmão", "Rotatória", "Serenata", "Transeunte", "Trilogia", "Xícara"};
	// 30 Palavras de dificuldade média
	
	private String[] dificil = new String[] {"Acender", "Afilhado", "Agnóstico", "Ardiloso", "Áspero", "Assombração", "Asterisco", "Balaústre", "Basquete", "Caminho", "Champanhe", "Chiclete", "Chuveiro", "Coelho", "Contexto", "Convivência", "Coração", "Desalmado", "Eloquente", "Esfirra", "Esquerdo", "Exceção", "Filantropo", "Fugaz", "Gororoba", "Heterossexual", "Horrorizado", "Idiossincrasia", "Impacto", "Inócuo", "Independência", "Jocoso", "Laurel", "Modernidade", "Oftalmologista", "Otorrinolaringologista", "Panaceia", "Paralelepípedo", "Pororoca", "Prognósticio", "Quarentena", "Quimera", "Refeição", "Reportagem", "Sino", "Taciturno", "Temperança", "Tênue", "Ufanismo", "Viscera"};
	// 50 Palavras de dificuldade difícil
	
	public Palavras() {
	}

	public String[] getFacil() {
		return facil;
	}

	public String[] getMedio() {
		return medio;
	}

	public String[] getDificil() {
		return dificil;
	}
	
	public String palavra(Dificuldade dificuldade, int numero) {
		
		switch (dificuldade.name()) {
		case "FACIL":
			
			return facil[numero];

		case "MEDIO":
			
			return medio[numero];
			
		case "DIFICIL":
			return dificil[numero];

		}
		return null;
	}
	
}