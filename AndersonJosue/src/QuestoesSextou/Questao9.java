package QuestoesSextou;

public class Questao9 {

	public static void main(String[] args) {

		int soma = 0;
		for (int i = 0; i <= 500; i++) {
			if (i % 2 == 0) {
				soma += i;
				// ********teste **** System.out.println(soma);
			}
		}

		System.out.println(soma);

	}

}
