package Questoes1a13;

import br.com.util.Teclado;

public class Questao9 {

	public static void main(String[] args) {
		int numero;

		numero = Teclado.lerInt("Digie um numero ");
		
		if (numero > 0) {
			System.out.println("O n�mero informado � positivo");
		}else if(numero < 0) {
			System.out.println("O n�mero informado � negativo");
		}else {
			System.out.println("O n�mero informado � nulo");
		}

	}

}
