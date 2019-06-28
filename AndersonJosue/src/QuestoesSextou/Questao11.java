package QuestoesSextou;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {

		int num1 = Teclado.lerInt("Digite o número: ");

		int num2 = Teclado.lerInt("Digite a potencia: ");

		int resultado = 0;

		if (num1 == 0) {
			resultado = 1;
		} else {

			for (int i = 0; i < num2; i++) {

				resultado *= num1;
			}
		}

		System.out.println(resultado);

	}

}
