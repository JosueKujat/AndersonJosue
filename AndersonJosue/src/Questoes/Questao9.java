package Questoes;

import br.com.util.Teclado;

public class Questao9 {

	public static void main(String[] args) {
		
		int numero = Teclado.lerInt("Digite um número inteiro: ");
		String visor = "";
		
		for (int i = 1; i <= numero; i++) {
			if (i % 3 == 0) {
				visor = visor + "\n" + i ;
			}
			else if (i % 5 == 0) {
				visor = visor + "\n" + i ;
			}
		}
		System.out.println("Números multiplos de 3 e de 5: " +visor);
	}

}
