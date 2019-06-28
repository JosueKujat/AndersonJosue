package Questoes;

import br.com.util.Teclado;

public class Questao3 {

	public static void main(String[] args) {

		int numero = Teclado.lerInt("Digite um numero");
		System.out.println("");
		{
			for (int y = 0; y <= 10; y++)
				System.out.println("* " + numero + " X " + y + " = " + numero * y + " *");

		}

	}

}
