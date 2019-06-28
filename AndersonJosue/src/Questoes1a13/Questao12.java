package Questoes1a13;

import br.com.util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int maior;
		int menor;

		numero1 = Teclado.lerInt("Digite o primeiro número: ");
		numero2 = Teclado.lerInt("Digite o segudno número: ");
		numero3 = Teclado.lerInt("Digite o terceiro número: ");
		numero4 = Teclado.lerInt("Digite o quarto número: ");
		numero5 = Teclado.lerInt("Digite o quinto número: ");

		maior = numero1;
		menor = numero1;

		if (numero2 > maior) {
			maior = numero2;
		}
		if (numero3 > maior) {
			maior = numero3;
		}
		if (numero4 > maior) {
			maior = numero4;
		} else {
			maior = numero5;
		}
		if (numero2 < maior) {
			menor = numero2;
		}
		if (numero3 < maior) {
			menor = numero3;
		}
		if (numero4 < maior) {
			menor = numero4;
		} else {
			menor = numero5;
		}

		System.out.println("O maior é: " + maior);
		System.out.println("O menor é: " + menor);
	}

}
