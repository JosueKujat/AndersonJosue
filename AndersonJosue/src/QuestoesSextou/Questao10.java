package QuestoesSextou;

public class Questao10 {

	public static void main(String[] args) {

		int num = 3;
		
		for (int i = 0; i <= 15; i++) {
			
			if (i == 0) {
				System.out.println(num + " elevado � " + i + " = 0");
				
			}
			else
			
			System.out.println(num + " elevado � " + i + " = " + Math.pow(num, i));
		}

	}

}
