package primeiraLista;
import  java.util.Scanner;
public class Atv2 {

	public static void main(String[] args) {
		/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
		 * o valor que recebe por hora e calcule o salário desse funcionário. 
		 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/
		Scanner input= new Scanner(System.in);
		int matricula =0;
		double pgPHora,hrsTrabalhadas,salario;
		System.out.print("Insira sua matrícula: ");
		matricula=input.nextInt();
		System.out.print("Quanto você costuma ganhar por hora? ");
		pgPHora=input.nextDouble();
		System.out.print("Quantas horas você trabalhou hoje? Responda no modelo 2,30 para 2:30 ");
		hrsTrabalhadas=input.nextDouble();
		salario=pgPHora*hrsTrabalhadas;
		System.out.println("Você receberá o equivalente à "+ String.format("%.2f", salario)+ "E sua matrícula é" + matricula);
		input.close();

	}

}
