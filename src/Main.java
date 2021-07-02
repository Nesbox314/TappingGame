import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcaoInicial;
		Boolean correto = true;

		String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		System.out.println("Bem vindo ao Tapping Game, deseja iniciar?");
		System.out.println("Digite 1 para iniciar");
		
		Scanner leitor = new Scanner(System.in);
		leitor.nextInt();
		
		while(correto) {
			String palavra = geradorDePalavras(alfabeto);
			System.out.println("Digite a palavra: " + palavra);
			String palavraTentativa = leitor.next();
			
			if(palavraTentativa.equals(palavra)) {
				System.out.println("Correto!");
				correto = true;
			} else {
				System.out.println("Incorreto!");
				correto = false;
			}
		}

	}

	public static String geradorDePalavras(String[] alfabeto) {
		Random r = new Random();
		String palavra = "";
		for(int x = 0; x < 10; x++){
			palavra = palavra + alfabeto[r.nextInt(25)];
		}
		return palavra;
	}

}
