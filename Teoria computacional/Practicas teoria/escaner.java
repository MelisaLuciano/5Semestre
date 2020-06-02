import java.util.Scanner;

public class escaner{

	public static void main (String[] args){

		Scanner scanner = new Scanner(System.in);

			System.out.println ("Ingrese un numero entero");
			int x;
			x = scanner.nextInt();
			System.out.println ("Dame otro numero");
			int y;
			y= scanner.nextInt();
			System.out.println("Otro numero: ");
			int z;
			z = scanner.nextInt();

			System.out.println("El resultado es:" + (x + y));

			int resultado;
			resultado = x * y;

			System.out.println ("el resultado es: "+ resultado);


	
	}
}