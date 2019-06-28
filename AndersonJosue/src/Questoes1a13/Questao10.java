package Questoes1a13;

import br.com.util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		int numero1;
		int numero2;

		numero1 = Teclado.lerInt("Digie um numero ");
		numero2 = Teclado.lerInt("Digie um numero ");

		if ((numero1 % numero2) == 0) {
			System.out.println("O segundo numero informado é divisor do primeiro!");
		} else {
			System.out.println("O segundo numero informado não é divisor do primeiro!");
		}

	}

}
