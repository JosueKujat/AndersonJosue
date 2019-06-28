package Questoes1a13;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		int bkp;
		
		numero1 = Teclado.lerInt("Digite o primeiro número: ");
		numero2 = Teclado.lerInt("Digite o segudno número: ");
		numero3 = Teclado.lerInt("Digite o terceiro número: ");
		
		if( numero1 > numero2) {
			bkp = numero1;
			numero1 = numero2;
			numero2 = bkp;
		}
		if( numero1 > numero3) {
			bkp = numero1;
			numero1 = numero3;
			numero3= bkp;
		}
		if( numero2 > numero3) {
			bkp = numero2;
			numero2 = numero3;
			numero3 = bkp;
		}
		if( numero2 > numero3) {
			bkp = numero2;
			numero2 = numero3;
			numero3= bkp;
		}
		System.out.println("Os números ordenados são: " + numero1 +  " - " + numero2 +  " - " + numero3);

	}

}
