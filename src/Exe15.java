import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * Faça um programa que use um vetor de tamanho N (constante), peça ao
 * usuário para informar os valores que devem ser validados, somente
 * devem ser aceitos valores entre 0 e 20 (inclusive 0 e 20). Após isto deve
 * ser gerado um gráfico com cada um dos valores conforme o exemplo abaixo
 * (levando em consideração que os valores informados no vetor foram 4, 2 e 1)
 * 4: ####
 * 2:##
 * 1:#
 */
public class Exe15 {
	
	private static final int N = 10;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[N];
		int val, i = 0;
		
		while (i < N) {
			System.out.print("Entre com um número: ");
			val = entrada.nextInt();
			if (0 <= val && val <= 20) {
				vetor[i] = val;
				i++;
			} else {
				System.out.println("Os valores devem estar no invervalo [0,20]!");
			}
		}
		
		for (int x = 0; x < N; x++) {
			System.out.print(vetor[x] + ": ");
			for (int y = 0; y < vetor[x]; y++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
		
		entrada.close();
	}
	
}
