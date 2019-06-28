package Questoes1a13;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		int numero;
		int calc;

		numero = Teclado.lerInt("Digie um numero com 3 casas decimais ");
		calc = numero / 100;
		if((numero >=100) && (numero <=999)) {
			System.out.println("Centena: " + calc);
		}else {
			System.out.println("O número informado esta incorreto, verifique!");
		}

	}

}
