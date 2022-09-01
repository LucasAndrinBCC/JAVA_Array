import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * 1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
 */
public class Exe1 {
	
	private static final int ARRAY_SIZE = 5;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros[] = new int[ARRAY_SIZE];
		
		for (int i = 0; i < ARRAY_SIZE; i++) {
			System.out.print("Entre com um número: ");
			numeros[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < ARRAY_SIZE; i++) {
			System.out.print(numeros[i] + "|");
		}
		
		entrada.close();
	}
	
}
