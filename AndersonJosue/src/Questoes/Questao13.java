package Questoes;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		
		double num;
		num = Teclado.lerDouble("digite as polegadas");

		for (double count = 1; count <= num; count++) {
			System.out.println(count + " polegada = " + (count * 2.54));
		}
	}
}
