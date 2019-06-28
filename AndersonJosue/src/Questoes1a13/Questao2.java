package Questoes1a13;

import br.com.util.Teclado;

public class Questao2 {

	public static void main(String[] args) {
		String capital;
		capital = Teclado.lerTexto("Digite a capital do Brasil: ");
		
		
		if(capital.equalsIgnoreCase("Brasilia")) {
			System.out.println("Resposta correta!");
			
		}else {
			System.out.println("Você errou!");
		}
	}

}
