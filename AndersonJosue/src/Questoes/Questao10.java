
public class Questao10 {

	public static void main(String[] args) {

		/*
		 * int numero = Teclado.lerInt("Digite um número: "); int resultado = 1;
		 * 
		 * for (int i = 0; i <= numero; i++) { resultado *= numero; numero--; }
		 * System.out.println(resultado);
		 */
		int n = Teclado.lerInt("Digite um numero");
		int fat = 1;

		for (int cont = 1; cont <= n; cont++) {
			fat = fat * cont;
		}

		System.out.println("numero fatorado de " + n + " é " + fat);
	}

}
