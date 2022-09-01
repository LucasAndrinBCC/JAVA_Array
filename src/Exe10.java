import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * Faça um programa que peça uma data no padrão dd/mm/aaaa,
 * valide esta data e coloque cada item em uma posição de
 * um vetor de inteiros de tamanho 3.
 */
public class Exe10 {

	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		
		int[] dayMonthYear = new int[3];
		
		System.out.print("Entre com uma data no formato dd/mm/aaaa: ");		
		String dataInformada = entrada.nextLine();
		
		if (dataInformada.length() != "dd/mm/aaaa".length()) {
			
			System.out.println("Data informada inválida! Tamanho da data errático!");
			
		} else if (dataInformada.charAt(2) != '/' || dataInformada.charAt(5) != '/') {
			
			System.out.println("Data informada inválida! Não foram encontradas barras nas posições corretas");
			
		} else {
			SimpleDateFormat diaMesAno = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dataFormatada = diaMesAno.parse(dataInformada);
			
			System.out.println("Data formatada final: " + diaMesAno.format(dataFormatada));
			
			dayMonthYear[0] = diaMesAno.format(dataFormatada).charAt(0) + diaMesAno.format(dataFormatada).charAt(1);
			
			dayMonthYear[1] = diaMesAno.format(dataFormatada).charAt(3) + diaMesAno.format(dataFormatada).charAt(4);
			
			dayMonthYear[2] = diaMesAno.format(dataFormatada).charAt(6) + diaMesAno.format(dataFormatada).charAt(7);
		}
		
		entrada.close();
	}
	
}
