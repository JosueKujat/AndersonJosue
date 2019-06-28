package Questoes1a13;

import br.com.util.Teclado;

public class Questao8 {

	public static void main(String[] args) {
		int numero;
		
		numero = Teclado.lerInt("Digie um numero ");
		
		
		if((numero >= 1) && (numero <=10) ) {
			System.out.println("O numero " + numero + " está entre 1 e 10");
		}else {
			System.out.println("O numero " + numero + " não está entre 1 e 10");
		}

	}

}
