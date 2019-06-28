package QuestoesSextou;

public class Questao10Alternativa {

	public static void main(String[] args) {

		int num = 3;

		/*	for (int i = 0; i <= 15; i++) {

			if (i == 0) {
				System.out.println(num + " elevado à " + i + " = 0");

			} else {*/
				
				int total = 0;

				for (int i = 0; i < num; i++) {

					total *= num;
					i++;

					System.out.println(num + " elevado à " + i + " = " + total);
				}

			}
		}
	
