package Questoes1a13;

import br.com.util.Teclado;

public class Questao6 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int calc1;
		int calc2;
		
		numero1 = Teclado.lerInt("Digite o primeiro numero: ");
		numero2 = Teclado.lerInt("Digite o segundo numero: ");
		calc1 = numero1 - numero2;
		calc2 = numero2 - numero1;
		if(numero1 > numero2) {
			System.out.println("A diferença entre os dois numeros é: " + calc1);
		}else {
			System.out.println("A diferença entre os dois numeros é: " + calc2);
		}
		
		
	}

}
