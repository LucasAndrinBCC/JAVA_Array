import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 *
 * Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
 * Armazene os números pares no vetor PAR e os números IMPARES no vetor impar.
 * Imprima os três vetores.
 */
public class Exe5 {
	
	public static final int QTD_NUMEROS = 20;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[QTD_NUMEROS],
				impar = new int[QTD_NUMEROS],
				par = new int [QTD_NUMEROS];
		int qtdImpar, qtdPar;
		qtdImpar = qtdPar = 0;
		
		for (int i = 0; i < QTD_NUMEROS; i++) {
			System.out.println("Entre com um número: ");
			numeros[i] = entrada.nextInt();
			
			if (numeros[i] % 2 == 0) {
				par[qtdPar] = numeros[i];
				qtdPar++;			
			} else {
				impar[qtdImpar] = numeros[i];
				qtdImpar++;
			}
		}

		System.out.println("Numeros informados: ");
		for (int i = 0; i < QTD_NUMEROS; i++) {
			System.out.print(numeros[i] + " | ");
		}
		
		System.out.println("Numeros pares: ");
		for (int i = 0; i < qtdPar; i++) {
			System.out.print(par[i] + " | ");
		}
		
		System.out.println("Numeros impares: ");
		for (int i = 0; i < qtdImpar; i++) {
			System.out.print(impar[i] + " | ");
		}
		
		entrada.close();
	}
	
}
