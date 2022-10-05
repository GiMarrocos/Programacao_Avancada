package primeiraLista;
import  java.util.Scanner;
public class Atv1 {

	public static void main(String[] args) {
		/*Leia 2 valores de ponto flutuante de dupla precisão A e B, 
		 * que correspondem a 2 notas de um aluno. Calcule a média ponderada do aluno, 
		 * sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5. 
		 * A soma dos pesos é 11. Assuma que cada nota pode ir de O até 10.0, sempre com uma casa.*/
		Scanner input= new Scanner(System.in);
		double p1=3.5,p2=7.5, result=0d;
		double A,B;
		System.out.print("Insira o valor de A: ");
		A=input.nextDouble();
		A*=p1;
		System.out.print("Insira o valor de B: ");
		B=input.nextDouble();
		B*= p2;
		result= (A+B)/11;
		if(result>10) {
			result=10.0;
		}
		System.out.println("O Resultado é equivalente à "+ String.format("%.2f", result));
		
		input.close();
		
	}

}
