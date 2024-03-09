/**/
import java.util.Scanner;
public class EXO2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		final float PI = 3.14f;

		System.out.print("Entrez le rayon d'un cercle : ");

		double rayon = scanner.nextDouble();

		scanner.close();

		double surface = PI*Math.pow(rayon, 2);

		System.out.println("La surface du cercle est de : " + surface);

		double perimetre = 2*PI*rayon;

		System.out.println("Le perimetre du cercle est de : " + perimetre);

	}
}