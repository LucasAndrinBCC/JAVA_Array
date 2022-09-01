import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um Programa que peça a idade e a altura de 5 pessoas, armazene
 * cada informação no seu respectivo vetor. Imprima a idade e a altura
 * na ordem inversa a ordem lida. Mostrar também idade e altura do mais
 * velho, mais novo, mais baixo e mais alto. Mostrar idade e altura de
 * quem está abaixo e acima da média de idade e altura;
 * 
 */
public class Exe12 {
	
	public static final int QTD_PESSOAS = 5;

	public static void main(String[] args) {
		/*
		 * Variáveis básicas
		 */
		Scanner entrada = new Scanner(System.in);
		float[] altura = new float[QTD_PESSOAS];
		int[] idade = new int[QTD_PESSOAS];
		boolean first = true;
		/*
		 * Criação de variáveis
		 */
		float mediaAltura, mediaIdade;
		
		float[] maisAlto = new float[2];
		float[] maisBaixo = new float[2];
		float[] maisNovo = new float[2];
		float[] maisVelho = new float[2];
		
		
		
		/*
		 * Inicialização de variáveis		
		 */
		mediaAltura = mediaIdade = 0f;
		
		/*
		 * Consulta
		 */
		for (int i = 0; i < QTD_PESSOAS; i++) {
			System.out.print("Entre com a idade: ");
			idade[i] = entrada.nextInt();
			
			System.out.print("Entre com a altura: ");
			altura[i] = entrada.nextFloat();
			
			if (first) {
				first = false;
				maisAlto[0] = idade[i];
				maisAlto[1] = altura[i];
				
				maisBaixo[0] = idade[i];
				maisBaixo[1] = altura[i];
				
				maisNovo[0] = idade[i];
				maisNovo[1] = altura[i];
				
				maisVelho[0] = idade[i];
				maisVelho[1] = altura[i];
			} else {
				if (altura[i] > maisAlto[1]) {
					maisAlto[0] = idade[i];
					maisAlto[1] = altura[i];
				} else if (altura[i] < maisBaixo[1]) {
					maisBaixo[0] = idade[i];
					maisBaixo[1] = altura[i];
				}
				
				if (idade[i] < maisNovo[0]) {
					maisNovo[0] = idade[i];
					maisNovo[1] = altura[i];
				} else if (idade[i] > maisVelho[0]) {
					maisVelho[0] = idade[i];
					maisVelho[1] = altura[i];
				}
			}
			
			mediaAltura += altura[i];
			mediaIdade += idade[i];
		}
		
		mediaAltura /= QTD_PESSOAS;
		mediaIdade /= QTD_PESSOAS;
		
		System.out.println("Lista de dados inversa: ");		
		for (int i = QTD_PESSOAS - 1; i >= 0; i--) {
			System.out.println("Idade: " + idade[i] + " Altura: " + altura[i]);
		}
		
		System.out.println("Mais Novo {");
		System.out.println("Idade: " + maisNovo[0]);
		System.out.println("Altura: " + maisNovo[1]);
		System.out.println("}");
		
		System.out.println("Mais Velho {");
		System.out.println("Idade: " + maisVelho[0]);
		System.out.println("Altura: " + maisVelho[1]);
		System.out.println("}");
		
		System.out.println("Mais Alto {");
		System.out.println("Idade: " + maisAlto[0]);
		System.out.println("Altura: " + maisAlto[1]);
		System.out.println("}");
		
		System.out.println("Mais Baixo {");
		System.out.println("Idade: " + maisBaixo[0]);
		System.out.println("Altura: " + maisBaixo[1]);
		System.out.println("}");
		
		System.out.println("Media de Alturas: " + mediaAltura);
		System.out.println("Media de Idades: " + mediaIdade);
		
		System.out.println("Acima da média: ");
		
		for (int i = 0; i < QTD_PESSOAS; i++) {
			if (idade[i] < mediaIdade && altura[i] < mediaAltura) {
				System.out.println("Idade: " + idade[i] + "\nAltura: " + altura[i] + "\n===========");
			}
		}
		
		entrada.close();
	}
	
}
