/**/
import java.util.Scanner;
public class EXO5
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int i;
		int factorielle;
		System.out.print("Entrez un entier : ");

		int n = scanner.nextInt();

		scanner.close();

		if(n==0)
		{
			factorielle = 1;
			System.out.println("La factorielle de 0 vaut 1");
		}
		else
		{

		i = n;
		factorielle = 1;
		while(i<=n && i>0)
		{
			factorielle = factorielle*i;
			i--;
		}
		}
	

		System.out.println("La factorielle de " + n + " vaut : " + factorielle);

	}
}