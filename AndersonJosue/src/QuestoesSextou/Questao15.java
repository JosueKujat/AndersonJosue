package QuestoesSextou;

public class Questao15 {

	public static void main(String[] args) {

		int anterior = 1;
		int posterior = 1;
		int cont = 1;
		int bkp;

		while (cont <= 15) {
			
			System.out.print(anterior + " - ");
			
			bkp = anterior + posterior;
			anterior = posterior;
			posterior = bkp;
			cont++;

		}
	}

}
