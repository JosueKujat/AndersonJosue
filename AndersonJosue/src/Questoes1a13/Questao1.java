package Questoes1a13;

import br.com.util.Teclado;

public class Questao1 {

	public static void main(String[] args) {
		double numero;
		numero = Teclado.lerDouble("Digite um numero para ação: " );
		
		
		if (numero > 20) {
			System.out.println("Resultao da divisao por 2 é: " + (numero/2));
		}else {
			System.out.println("Não ha divisão: " + numero);
		}

	}

}
