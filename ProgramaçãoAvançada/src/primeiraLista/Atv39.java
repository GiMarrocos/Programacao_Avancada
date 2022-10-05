package primeiraLista;

import java.util.Scanner;

public class Atv39 {

	public static void main(String[] args) {
		// Elabore um programa que permita exibir na tela a tabuada de um número inteiro
		//informado via teclado.
		Scanner input = new Scanner(System.in);
		int entrada;
        System.out.println("Informar um número: ");
        entrada = input.nextInt();

        int multiplicador = 1;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);   
            multiplicador++;
        }

         input.close();
        }


	}


