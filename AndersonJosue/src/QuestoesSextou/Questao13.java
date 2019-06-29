package QuestoesSextou;

public class Questao13 {

	public static void main(String[] args) {
		int a = 3;
		int b;

		while (a <= 6) {
			b = 0;
			System.out.println("-----------");
			while (b <= 10) {

				System.out.println(a + " x " + b + " = " + (a * b));
				
				b++;
			}

			a++;
		}

	}

}
