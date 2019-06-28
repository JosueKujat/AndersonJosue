package Questoes;

import br.com.util.Teclado;

public class Questao8 {

	public static void main(String[] args) {

		String visor = ""; 
		
		
		for (int i = 0; i < 5; i++) {
			
			String nome = Teclado.lerTexto("Digite o nome da pessoa: ");
			String sexo = Teclado.lerTexto("Digite o sexo da pessoa (M/F): ");
			int idade = Teclado.lerInt("Digite a idade do individuo: ");
			
			if (sexo.equalsIgnoreCase("m") && idade >= 21) {
				visor = visor + "\n" + nome ;
			}
			
			
		}
		System.out.println(visor);

	}

}
