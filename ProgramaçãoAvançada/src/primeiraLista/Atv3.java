package primeiraLista;
import  java.util.Scanner;
public class Atv3 {

	public static void main(String[] args) {
		/*Faça um programa que lê o nome de um vendedor, 
		 * o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
		 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
		 * informar o total a receber no final do mês, com duas casas decimais.*/
		Scanner input= new Scanner(System.in);
		String nome;
		int quant;
		Double comissao, sFixo=0d,total;
		System.out.print("Por favor, digite seu nome: ");
		nome=input.next();
		System.out.print("Quanto você recebe de salário fixo por mês? ");
		sFixo=input.nextDouble();
		System.out.print("Quantas vendas em dinheiro você realizou? ");
		quant=input.nextInt();
		comissao=quant*0.15;
		total=sFixo+ comissao;
		System.out.println(nome + ": TOTAL = R$ " + total);

		input.close();
	}

}
