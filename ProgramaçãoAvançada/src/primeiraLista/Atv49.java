package primeiraLista;

import java.util.Scanner;

public class Atv49 {

	public static void main(String[] args) {
		/*Construa um programa para determinar se o indivíduo está com um peso
		favorável ou não. Essa situação é determinada através do IMC (Índice de Massa
		Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado
		da Altura (ALTURA) do indivíduo. Ou seja, IMC = PESO / (ALTURA*ALTURA) e, a
		situação do peso é determinada pela tabela abaixo: */
		double peso,altura,Imc;
		Scanner input= new Scanner(System.in);
		System.out.println("Digite o seu peso: ");
		peso=input.nextDouble();
		System.out.println("Digite a sua altura: ");
		altura=input.nextDouble();
		Imc=peso/(altura*altura);
		if(Imc<20) {
			System.out.println("Seu Imc é " + Imc + ",você está abaixo do peso.");
		}else if(Imc<20 && Imc<25){
			System.out.println("Seu Imc é " + Imc + ",você está com o peso normal.");
		}else if(Imc>25 && Imc<30){
			System.out.println("Seu Imc é " + Imc + ",você está com sobrepeso.");
		}else if(Imc>30 && Imc<40){
			System.out.println("Seu Imc é " + Imc + ",você está obeso.");
		}else if ( Imc>40) {
			System.out.println("Seu Imc é " + Imc + ",você está obeso mórbido.");
		}
	   input.close();
	}

}

		
	


