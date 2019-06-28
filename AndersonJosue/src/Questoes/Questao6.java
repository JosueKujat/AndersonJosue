
public class Questao6 {

	public static void main(String[] args) {

		int numero = Teclado.lerInt("Digite um número: ");
		int expoente = Teclado.lerInt("Digite a que número deseja elevar: ");

		int resultado = numero;

		for (int i = 1; i < expoente; i++) {

			resultado = resultado * numero;

		}

		System.out.println(resultado);

	}
}
