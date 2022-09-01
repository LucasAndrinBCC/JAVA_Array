import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * Faça um Programa que peça as quatro notas de 10 alunos,
 * calcule e armazene num vetor a média de cada aluno, imprima o
 * número de alunos com média maior ou igual a 7.0.
 */
public class Exe6 {
	
	public static final int QTD_NOTAS = 2;
	public static final int QTD_ALUNOS = 3;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[] medias = new float[QTD_ALUNOS * QTD_NOTAS];
		int qtdAlunosAprovados = 0;
		
		for (int i = 0; i < QTD_ALUNOS; i++) {
			medias[i] = 0;
			
			for (int j = 0; j < QTD_NOTAS; j++) {
				System.out.print("Entre com a nota do " + i + "º aluno: ");
				medias[i] += entrada.nextFloat();
			}
			
			medias[i] = medias[i]/QTD_NOTAS;
			
			if (medias[i] >= 7) {
				qtdAlunosAprovados++;
			}
		}
		
		System.out.println("Quantidade de alunos Aprovados: " + qtdAlunosAprovados);
		
		entrada.close();
	}
	
}
