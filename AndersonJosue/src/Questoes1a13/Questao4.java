package Questoes1a13;

import br.com.util.Teclado;

public class Questao4 {

	public static void main(String[] args) {

		double numero;
		numero = Teclado.lerDouble("Digite um numero: ");

		if (((numero % 4) == 0) && ((numero % 5) == 0)) {
			System.out.println("O numero " + numero + " pode ser dividido por 4 e 5");

		}else {
			System.out.println("O numero " + numero + " não pode ser dividido por 4 e 5");
		}

	}

}
