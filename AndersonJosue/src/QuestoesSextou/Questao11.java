package QuestoesSextou;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {

		int num1 = Teclado.lerInt("Digite o n�mero: ");

		int num2 = Teclado.lerInt("Digite a potencia: ");

		
		int resultado = 1;
		
		
		for (int i = 0; i < num2; i++) {
			
			resultado = resultado * num1;
			
		}
		System.out.println(resultado);
	}

}
