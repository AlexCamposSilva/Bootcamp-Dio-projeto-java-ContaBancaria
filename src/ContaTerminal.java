import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite seu número.");
		int numero = scanner.nextInt();
		
		System.out.println("Por favor, digite numero da sua agência.");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite seu nome.");
		String nome = scanner.next();
		
		System.out.println("Por favor, digite seu saldo.");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado por criar uam conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e saldo " + saldo + " já está disponível pra saque.");
		
	}

}
