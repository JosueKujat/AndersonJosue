package Questoes1a13;

import br.com.util.Teclado;

public class Questao7 {

	public static void main(String[] args) {
		int numero, calc;
		
		numero = Teclado.lerInt("Digite um numero positivo ou negativo: ");
		calc = numero * -1;
		
		
		if (numero >= 0) {
			System.out.println("O modulo deste valor é: " + numero);
		}else {
			System.out.println("O modulo deste valor é: "  + calc);
		}
		
		
		
	}

}
