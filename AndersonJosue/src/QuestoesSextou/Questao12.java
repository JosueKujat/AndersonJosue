package QuestoesSextou;

import br.com.util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		double real;
		double maior;
		double menor;
		double media;
		double soma = 0;
		int cont = 1;

		real = Teclado.lerDouble("Digite um numero! Obs: -1 encerra a ac�o");
		maior = real;
		menor = real;

		while (real != -1) {

			if (maior < real) {
				maior = real;
			}
			if (menor > real) {
				menor = real;
			}

			soma += real;

			real = Teclado.lerDouble("Digite um numero! Obs: -1 encerra a ac�o");
			cont++;
		}
		media = soma / (cont -1);
		if (menor == -1) {
			System.out.println("Fim do programa, voc� digitou -1!");
		} else {
			System.out.println("O menor valor �: " + menor);
			System.out.println("O maior valor �: " + maior);
			System.out.println("Media geral �: " + media);

		}

	}

}
