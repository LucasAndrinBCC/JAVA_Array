import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * Faça um Programa que leia um vetor de 5 números inteiros,
 * mostre a soma, a multiplicação e os números.
 */
public class Exe7 {
	
	public static final int QTD_NUMEROS = 5;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[QTD_NUMEROS];
		int soma = 0, multiplicacao = 1;
		
		for (int i = 0; i < QTD_NUMEROS; i++) {
			System.out.print("Informe um número inteiro: ");
			numeros[i] = entrada.nextInt();
			soma += numeros[i];
			multiplicacao *= numeros[i];
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Multiplicação: " + multiplicacao);
		
		for (int i = 0; i < QTD_NUMEROS; i++) {
			System.out.print(numeros[i] + " | ");
		}
		
		entrada.close();
	}
	
}
