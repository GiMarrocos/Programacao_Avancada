package primeiraLista;
import java.util.Scanner;
public class Atv8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		double y, xy;
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Quantos quilometros  você percorreu?");
		x=leitor.nextInt();
		System.out.print("Quanto combustivel você gastou?");
		y=leitor.nextDouble();
		xy=x/y;
		System.out.print("Você fez "+ xy+ "km/l");
		
		leitor.close();
	}

}
