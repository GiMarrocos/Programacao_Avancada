package primeiraLista;
import java.util.Scanner;
public class Atv14 {

	public static void main(String[] args) {
		// Leia um valor inteiro X. Em seguida apresento os 6 valores ímpares
		//consecutivos a partir do X, um valor por linha, Inclusive o X se for o caso.

		Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;
        while (cont < 6) {
        	if (x % 2 == 1) {
        		System.out.println(x);
        		cont++;
        	}
    		x++;
        }
        leitor.close();
	}
}
