package Questoes1a13;

import br.com.util.Teclado;

public class Questao9 {

	public static void main(String[] args) {
		int numero;

		numero = Teclado.lerInt("Digie um numero ");
		
		if (numero > 0) {
			System.out.println("O número informado é positivo");
		}else if(numero < 0) {
			System.out.println("O número informado é negativo");
		}else {
			System.out.println("O número informado é nulo");
		}

	}

}
