package primeiraLista;

import java.util.Scanner;

public class Atv33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		int N; 
		
		System.out.println("Informe um Número: "); 
		N = sc.nextInt(); 
		
		for(int i = 0; i < N; i++) {
			
			System.out.println(i + " " + (i * i) + " " + (i * i * i)); 
		}
		sc.close();
	}

}
