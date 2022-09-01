import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um Programa que leia um vetor de 10 caracteres,
 * e diga quantas consoantes foram lidas. Imprima as consoantes.
 */
public class Exe4 {
	
	public static final int QTD_CARACTERES = 10;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/**
		 * É necessário especificar as consoantes, pois fazer qualquer
		 * verificação considerando a diferença com caracteres vogais
		 * desconsidera caracteres especiais
		 */
		char[] consoantes = {'B','C','D','F','G','J','K','L','M','N','P','Q','R','S','T','V','W','X','Z'};
		char[] caracteres = new char[QTD_CARACTERES];
		int qtdConsoantes = 0;
		
		for (int i = 0; i < QTD_CARACTERES; i++) {
			System.out.print("Entre com um caractere: ");
			caracteres[i] = Character.toUpperCase(entrada.nextLine().charAt(0));
			
			for (int j = 0; j < consoantes.length; j++) {
				if (consoantes[j] == caracteres[i]) {
					qtdConsoantes++;
					break;
				}
			}
		}
		
		System.out.println("Quantidade de Consoantes: " + qtdConsoantes);
		
		entrada.close();
	}
	
}
