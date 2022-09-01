import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa que tenha como entrada várias palavras separadas por ; 
 * (rodrigo;curvello;antonio;....) separe as palavras e coloque
 * cada uma em uma posição do vetor
 */
public class Exe11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com palavras separadas por ';' ");
		String text = entrada.next();
		
		String[] arrayText = text.split(";");
		
		for (int i = 0; i < arrayText.length; i++) {
			System.out.println(arrayText[i]);
		}
		
		entrada.close();
	}
	
}
