import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite seu n�mero.");
		int numero = scanner.nextInt();
		
		System.out.println("Por favor, digite numero da sua ag�ncia.");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite seu nome.");
		String nome = scanner.next();
		
		System.out.println("Por favor, digite seu saldo.");
		double saldo = scanner.nextDouble();
		
		System.out.println("Ol� " + nome + ", obrigado por criar uam conta em nosso banco, sua ag�ncia � " + agencia + ", conta " + numero + " e saldo " + saldo + " j� est� dispon�vel pra saque.");
		
	}

}
