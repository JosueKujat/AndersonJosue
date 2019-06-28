package Questoes;

import br.com.util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		int nota;
		int nota2;

		String aluno;

		double media;

		for (int i = 0; i < 15; i++) {

			aluno = Teclado.lerTexto("Digite o nome do aluno: ");
			nota = Teclado.lerInt("Digite a primeira nota: ");
			nota2 = Teclado.lerInt("Digite a primeira nota: ");

			media = (nota + nota2) / 2;
			System.out.println("Aluno: " + aluno);
			System.out.println("A primeira nota é: " + nota);
			System.out.println("A primeira nota é: " + nota2);
			System.out.println("A media é: " + media);

			if (media < 5) {
				System.out.println("Reprovado");
			} else {

				System.out.println("Aprovado");
			}

		}

	}

}
