package QuestoesSextou;

public class Questao14 {

	public static void main(String[] args) {
		int cont = 1;
		int fator = 1;
		
		while (cont <=5) {
		
			fator = fator*cont;
			cont++;
		}

		System.out.println("O fatorial do número 5 é: " + fator);
	}

}
