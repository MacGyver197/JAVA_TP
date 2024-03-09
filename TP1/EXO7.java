/**/
import java.util.Scanner;
public class EXO7
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		double delta, x, y;
		
		System.out.print("Résolution d'une équation du type : aX^(2) + bX + c = 0\n\n");

		System.out.print("Entrez un reel a : ");

		double a = scanner.nextDouble();

		System.out.print("Entrez un reel b : ");

		double b = scanner.nextDouble();

		System.out.print("Entrez un reel c : ");

		double c = scanner.nextDouble();

		scanner.close();

		delta = Math.pow(b, 2) - 4*a*c;

		if (delta == 0)
		{	
			x = (-b)/(2*a);
			System.out.println("L'équation admet une unique solution dans R qui est : X = " + x);

		}
		else if(delta>0)
		{
			x = (-b-Math.sqrt(delta))/(2*a);
			y = (-b+Math.sqrt(delta))/(2*a);
			System.out.println("L'équation admet 2 solutions dans R qui sont : X1 = " + x + "\n X2 = " + y);
		}
		else
		{
			System.out.println("L'équation n'admet aucune solution das R !");	
		}
	

	}
}