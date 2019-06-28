package Questoes;

import br.com.util.Teclado;

public class Questao2 {

	public static void main(String[] args) {

		int numero = Teclado.lerInt("Digite um número");
		
		int soma = 0;
		
		for (int i = 1; i <= numero; i++) {
			soma += i;
			// System.out.println(i);       *********teste**********
			
		}
		System.out.println(soma);
	}

}
