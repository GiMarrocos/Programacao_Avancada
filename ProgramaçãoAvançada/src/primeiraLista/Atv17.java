package primeiraLista;

import java.util.Scanner;

public class Atv17 {

	public static void main(String[] args) {
		/*Na matemática, um Número Primo é aquele que pode ser dividido somente por 1
		(um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido
		apenas pelo número 1 e pelo número 7.*/
		Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X, cont;
        for (int i = 0; i < N; i++) {
        	cont = 0;
        	X = input.nextInt();
        	for (int j = 2; j < X; j++) {
        		if (X % j == 0) cont++;
        	}
        	if (cont == 0) System.out.println(X + " É primo");
        	else System.out.println(X + " Não é primo");
        }
        input.close();
    }
}


