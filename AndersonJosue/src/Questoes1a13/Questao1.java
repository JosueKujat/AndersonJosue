package Questoes1a13;

import br.com.util.Teclado;

public class Questao1 {

	public static void main(String[] args) {
		double numero;
		numero = Teclado.lerDouble("Digite um numero para a��o: " );
		
		
		if (numero > 20) {
			System.out.println("Resultao da divisao por 2 �: " + (numero/2));
		}else {
			System.out.println("N�o ha divis�o: " + numero);
		}

	}

}
