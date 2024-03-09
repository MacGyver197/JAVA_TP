import java.util.Scanner;
public class EXO3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int c;

		System.out.print("Entrez un entier a : ");

		int a = scanner.nextInt();

		System.out.print("Entrez un entier b : ");

		int b = scanner.nextInt();

		scanner.close();

		System.out.println("Avant permutation : \n a = " + a + "\n b = " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("Après permutation :\n a = " + a + "\n b = " + b);

	}
}