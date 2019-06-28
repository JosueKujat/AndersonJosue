package Questoes;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {

		double salarioBruto;
		double aliquota;
		double Faixa1 = 600;
		double Faixa2 = 1499;
		double Faixa3 = 1500;
		double Aliquota1 = 0;
		double Aliquota2 = 0.10;
		double Aliquota3 = 0.15;
		String nome;

		for (int i = 0; i < 10; i++) {
			nome = Teclado.lerTexto("Digite o nome");

			salarioBruto = Teclado.lerDouble("Digite o salario bruto");

			if (salarioBruto <= Faixa1) {
				aliquota = Faixa1 * Aliquota1;
			} else if (salarioBruto <= Faixa2) {
				aliquota = Faixa2 * Aliquota2;
			} else if (salarioBruto <= Faixa3) {
				aliquota = Faixa3 * Aliquota3;
			} else {
				aliquota = Faixa3 * Aliquota3;
			}

			System.out.println("Nome: " + nome);
			System.out.println("Alíquota do imposto de renda: " + aliquota);
			
			System.out.println("Salario limpo: " + (salarioBruto - aliquota));
		}

	}

}
