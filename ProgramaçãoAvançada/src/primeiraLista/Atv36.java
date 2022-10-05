package primeiraLista;

import java.util.Scanner;

public class Atv36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		int ho; 
		
		System.out.println("Informe a quantidade de Hos para o papai Noel: "); 
		ho = sc.nextInt();
		
		for(int i = 0; i < ho; i++) {
			
			System.out.print(" HO! "); 
		}
		sc.close();
	}
}
