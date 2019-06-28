package QuestoesSextou;

import br.com.util.Teclado;

public class Questao5 {

	public static void main(String[] args) {

		int num = Teclado.lerInt("Digite um número: ");
		int multiplica;
		
		for (int i = 0; i <= 10; i++) {
			multiplica = num * i;
			System.out.println(num + " . " + i + " = " + multiplica);
		}

	}

}
