import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * Faça um Programa que leia dois vetores com 10 elementos
 * cada. Gere um terceiro vetor de 20 elementos, cujos
 * valores deverão ser compostos pelos elementos
 * intercalados dos dois outros vetores.
 */
public class Exe13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] pares = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] impares = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		int[] intervalo = new int[20];
		
		int i = 0;
		int j = 0;
		while (i < 20) {
			intervalo[i] = impares[j];
			intervalo[i + 1] = pares[j];
			System.out.print(intervalo[i] + "|" + intervalo[i + 1] + "|");
			i += 2;
			j++;
		}
		
		entrada.close();
	}
	
}
