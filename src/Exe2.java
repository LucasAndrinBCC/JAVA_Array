import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * Faça um Programa que leia um vetor de 10 números reais e
 * mostre-os na ordem inversa a ordem lida.
 */
public class Exe2 {
	
	private static final int ARRAY_SIZE = 10;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[ARRAY_SIZE];
		
		for (int i = 0; i < ARRAY_SIZE; i++) {
			System.out.print("Entre com um número: ");
			numeros[i] = entrada.nextInt();
		}
		
		for (int i = ARRAY_SIZE - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " | ");
		}
		
		entrada.close();
	}
	
}
