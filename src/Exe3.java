import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
 */
public class Exe3 {
	
	public static final int QTD_NOTAS = 5;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[] notas = new float[QTD_NOTAS];
		float media = 0f;
		
		for (int i = 0; i < QTD_NOTAS; i++) {
			System.out.print("Entre com uma nota: ");
			notas[i] = entrada.nextFloat();
			media += notas[i];
		}
		
		for (int i = 0; i < QTD_NOTAS; i++) {
			System.out.print(notas[i] + " | ");
		}
		
		System.out.println("\nMédia: " + (media / QTD_NOTAS));
		
		entrada.close();
	}
	
}
