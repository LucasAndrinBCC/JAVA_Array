import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa que peça um texto e coloque-o em um vetor onde cada
 * carácter ocupará uma posição do vetor.
 */
public class Exe9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um texto: ");
		String texto = entrada.nextLine();
		
		char[] caracteres = new char[texto.length()];
		
		for (int i = 0; i < texto.length(); i++) {
			caracteres[i] = texto.charAt(i);
			System.out.print(caracteres[i] + " | ");
		}
		
		entrada.close();
	}
	
}
