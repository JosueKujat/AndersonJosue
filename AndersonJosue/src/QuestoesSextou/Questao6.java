package QuestoesSextou;

import br.com.util.Teclado;

public class Questao6 {

	public static void main(String[] args) {

		int num = 51;

		while (num > 50) {

			num = Teclado.lerInt("Digite um número: ");

		}

		int produto = num;
		int cont = 3;

		while (produto < 250) {

			produto = num * cont;
			cont *= 3;
			
			if (produto < 250) {
				System.out.println(produto);
			}
		}
	}

}
