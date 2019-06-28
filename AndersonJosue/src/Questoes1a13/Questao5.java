package Questoes1a13;

import br.com.util.Teclado;

public class Questao5 {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;

		nota1 = Teclado.lerDouble("Digite a primeira nota: ");
		nota2 = Teclado.lerDouble("Digite a segunda nota: ");
		nota3 = Teclado.lerDouble("Digite a terceira nota: ");
		nota4 = Teclado.lerDouble("Digite a quarta nota: ");

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 5) {
			System.out.println("Aprovado com media " + media);
		} else {

			System.out.println("Reprovado com media " + media);
		}

	}

}
