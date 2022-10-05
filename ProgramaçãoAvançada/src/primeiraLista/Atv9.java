package primeiraLista;
import java.util.Scanner;
public class Atv9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner leitor = new Scanner(System.in);
		    int segundos, h, m, s, resto;

		    System.out.print("Digite uma quantidade de segundos: ");
		    segundos=leitor.nextInt();
		    h = segundos / 3600;
		    resto = segundos % 3600;
		    m = resto / 60;
		    s = resto % 60;
		    System.out.printf("%d:%d:%d\n", h, m, s);

		  leitor.close();
		}
	}


