import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcaoInicial;
		Boolean correto = true;
		String[] arrayDePalavras = {"Teste1", "Teste2", "Teste3", "Teste4", "Teste5", "Teste6", 
				"Teste7", "Teste8", "Teste9", "Teste10", "Teste11", "Teste12"};
		
		System.out.println("Bem vindo ao Tapping Game, deseja iniciar?");
		System.out.println("Digite 1 para iniciar");
		
		Scanner leitor = new Scanner(System.in);
		opcaoInicial = leitor.nextInt();
		
		while(correto) {
			Random random = new Random();
			int numeroRandomico = random.nextInt(arrayDePalavras.length);
			
			System.out.println("Digite a palavra: " + arrayDePalavras[numeroRandomico]);
			String palavraTentativa = leitor.next();
			
			if(palavraTentativa.equals(arrayDePalavras[numeroRandomico])) {
				System.out.println("Correto!");
				correto = true;
			} else {
				System.out.println("Incorreto!");
				correto = false;
			}
		}

	}

}
