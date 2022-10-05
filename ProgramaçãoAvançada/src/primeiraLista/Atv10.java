package primeiraLista;
import java.util.Scanner;
public class Atv10 {

	public static void main(String[] args) {
		/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a
		em anos, meses e dias. Obs: Apenas para facilitar o cálculo, considere todo ano
		com 365 dias e todo mês com 30 dias.*/
		         int idade, anos, saldo, meses, dias ;
		         Scanner input = new Scanner(System.in);
		         System.out.print("Digite  sua idade: ");
		         idade=input.nextInt();
		         anos = (idade / 365);

		        		 saldo = idade - (anos * 365);

		        		 meses =(saldo / 30);

		        		 dias = saldo - meses * 30;

                System.out.println(anos +  " ,  ano(s)");

                System.out.println(meses + " , mês(es)");

                System.out.println(dias +  " ,  dias(s)" );
                
                input.close();

	}

}
