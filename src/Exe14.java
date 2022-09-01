import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * Foram anotadas as idades e alturas de 30 alunos. Faça um Programa
 * que determine quantos alunos com mais de 13 anos possuem altura
 * inferior à média de altura desses alunos.
 */
public class Exe14 {
	
	private static final int QTD_ALUNOS = 30;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] idades = new int[QTD_ALUNOS];
		int[] alturas = new int[QTD_ALUNOS];
		int qtdAlunosMais13MenorMedia = 0;
		float mediaAltura = 0;
		
		for (int i = 0; i < QTD_ALUNOS; i++) {
			System.out.println("========|Aluno|========");
			System.out.print("Informe a idade: ");
			idades[i] = entrada.nextInt();
			System.out.print("Informe a altura: ");
			alturas[i] = entrada.nextInt();
			mediaAltura += alturas[i];
		}
		
		mediaAltura /= QTD_ALUNOS;
		
		for (int i = 0; i < QTD_ALUNOS; i++) {
			if (idades[i] > 13 && alturas[i] < mediaAltura) {
				qtdAlunosMais13MenorMedia++;
			}
		}
		
		System.out.println("Quantidade de alunos com menos de 13 anos e altura inferior a media: " + qtdAlunosMais13MenorMedia);
		
		entrada.close();
	}
	
}
