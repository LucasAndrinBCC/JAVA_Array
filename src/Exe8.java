import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author Lucas Andrin
 * 
 * Dado um vetor contendo todas as letras do nosso alfabeto (minúsculas)
 * gere uma senha para o usuário. Para isto o usuário deve informar
 * o tamanho da senha que deseja, este tamanho
 * deve ser menor que a quantidade de letras no vetor. A senha
 * gerada deve seguir o padrão consoante+vogal para tamanhos pares
 * e consoante+vogal e terminada em consoante paratamanhos ímpares.
 */
public class Exe8 {
	
	public static final char[] CONSOANTES = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','X','y','z'};
	public static final char[] VOGAIS = {'a', 'e', 'i', 'o', 'u'};

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random rand = new Random();
		String senha = "";
		
		System.out.print("Entre com o número de caracteres que deve possuir a senha: ");
		int tamanhoSenha = entrada.nextInt();
		
		for (int i = 0; i < tamanhoSenha; i++) {
			senha += retornaLetraRandomica(i, rand);
		}
		
		System.out.println("Senha gerada: " + senha);
		
		entrada.close();
	}
	
	private static char retornaLetraRandomica(int i, Random rand) {
		if (i % 2 == 0) {
			return CONSOANTES[rand.nextInt(CONSOANTES.length)];
		} else {
			return VOGAIS[rand.nextInt(VOGAIS.length)];
		}
		
	}
}
