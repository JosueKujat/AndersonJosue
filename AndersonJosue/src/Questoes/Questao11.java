package Questoes;

public class Questao11 {

	public static void main(String[] args) {

		for (int colunas = 1; colunas <= 10; colunas++) {

			for (int linhas = 1; linhas <= 10; linhas++) {

				/*if (colunas >= 1 && colunas <= 9) {
					System.out.print(colunas + "-" + linhas + " ");*/

					
					 if (colunas >= linhas) 
					 { System.out.print("x-x ");
					
				} else {

					System.out.print(colunas + "-" + linhas + " ");
				}
			}
			System.out.println();
		}
	}
}
