
public class Questao6 {

	public static void main(String[] args) {

		int numero = Teclado.lerInt("Digite um n�mero: ");
		int expoente = Teclado.lerInt("Digite a que n�mero deseja elevar: ");

		int resultado = numero;

		for (int i = 1; i < expoente; i++) {

			resultado = resultado * numero;

		}

		System.out.println(resultado);

	}
}
