package QuestoesSextou;

public class Questao10Alternativa {

	public static void main(String[] args) {

		int num1 = 3;

		int num2 = 15;

		int resultado = 1;

		for (int i = 0; i <= num2; i++) {
			
			if (i == 0) {
				System.out.println(num1 + " elevado a " + i + " = 0");
				i++;
			}

			resultado = resultado * num1;
			System.out.println(num1 + " elevado a " + i + " = " + resultado);
		}
		

	}
}
