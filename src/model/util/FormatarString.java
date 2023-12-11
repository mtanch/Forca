package model.util;

public class FormatarString {
	public static String removerAcentos(String texto) {
		
		String[] letras = new String[] {"á", "é", "í", "ó", "ú", "â", "ê", "ô", "ç", "ã"};
		String[] letraSemAcento = new String[] {"a", "e", "i", "o", "u", "a", "e", "o", "c", "a"};
		
		for (int i = 0; i < letras.length; i++) {
			for (int j = 0; j < texto.length(); j++) {
				if (texto.charAt(j) == letras[i].charAt(0)) {
					texto = texto.replace(texto.charAt(j), letraSemAcento[i].charAt(0));
				}
			}
		}
		
		return texto;
    }
}
