package Questoes1a13;

import br.com.util.Teclado;

public class Questao3 {

	public static void main(String[] args) {
		int numero;
		numero = Teclado.lerInt("Digite um numero para saber se é par ou ímpar: ");

		if ((numero % 2) == 0) {
			System.out.println("O numero é par!");
		}else {
			System.out.println("O numero é ímpar!");
		}
	}

}
