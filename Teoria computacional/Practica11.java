import java.util.Scanner;
/**
*
* @author Melisa y Cesar :3
*/
public class Practica11 {
/**
* @param args the command line arguments
*/
	public static void main(String[] args) {
	// TODO code application logic here
		String[] a = new String[100]; //El arreglo "a" representa el alfabeto 1
		String[] b = new String[100]; //El arrelgo "b" representa el alfabeto 2
		Scanner scanner = new Scanner(System.in); //Objeto scanner para leer los valores que introducira el usuario
		String rangoAlfabeto1; //En este String se guardará el primer rango para definir el alfabeto 1
		String rangoAlfabeto2; //En este String se guardará el segundo rango para definir el alfabeto 2
		String w1; //En este String se guardará la primera cadena perteneciente al alfabeto 1
		String w2; //En este String se guardará la segunda cadena perteneciente al alfabeto 1
		String res; //Variable auxiliar
		String aux; //Variable auxiliar

			//Pedimos los rangos de los alfabetos
		System.out.println("Ingrese los rangos para los alfabetos");
		rangoAlfabeto1 = scanner.nextLine();
		rangoAlfabeto2 = scanner.nextLine();


		int rangoInferior1 = 0;
		int rangoSuperior1 = 0;
		int indiceAlfabeto1 = 0;
		char c;

		int rangoInferior2 = 0;
		int rangoSuperior2 = 0;
		int indiceAlfabeto2 = 0;

		//Asignamos el valor ascii de los caracteres que tenemos como rangos
		rangoInferior1 = rangoAlfabeto1.codePointAt(0);
		rangoSuperior1 = rangoAlfabeto1.codePointAt(2);

		rangoInferior2 = rangoAlfabeto2.codePointAt(0);
		rangoSuperior2 = rangoAlfabeto2.codePointAt(2);

		//Llenamos el alfabeto "a" con el primer rango
		for (int i = rangoInferior1; i <= rangoSuperior1; i++){
			c = (char)i;
			a[indiceAlfabeto1] = Character.toString(c);
			indiceAlfabeto1++;
		}

		//Llenamos el alfabeto "b" con el segundo rango
		for (int i = rangoInferior2; i <= rangoSuperior2; i++){
			c = (char)i;
			b[indiceAlfabeto2] = Character.toString(c);
			indiceAlfabeto2++;
		}
		//Validamos que la primer cadena pertenece al alfabeto 1
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int flag = 0;
		do{ 
		System.out.println("Ingrese una cadenas perteneciente al primer alfabeto");
		w1 = scanner.nextLine();

		for (int i = 0; i <= (w1.length()) - 1; i++) {
			flag = 0;
			if (i < w1.length()) {
				aux = w1.substring(i, (i + 1));	
			} else{
				aux = w1.substring(i);
			}
			a1 = aux.codePointAt(0);
			if (a1 >= rangoInferior1 && a1 <= rangoSuperior1) {
				a3 = a[a2].codePointAt(0);   	
			} else{
				System.out.println("El caracter " + aux + " no pertenece al alfabeto");
				flag ++;
			}					
		}

		} while(flag != 0);

		String aux2;
		do{
		System.out.println("Ingrese una cadena perteneciente al segundo alfabeto");
		w2 = scanner.nextLine();

		for (int i = 0; i <= (w2.length()) - 1; i++) {
			flag = 0;
				if (i < w2.length()) {
					aux2 = w2.substring(i, (i + 1));	
				} else{
					aux2 = w2.substring(i); 
				}
					a1 = aux2.codePointAt(0);
				if (a1 >= rangoInferior2 && a1 <= rangoSuperior2) {
					a3 = a[a2].codePointAt(0);   	
				} else{
					System.out.println("El caracter " + aux2 + " no pertenece al alfabeto");
					flag ++;
				}	
		}

		}while(flag != 0);

		String potencia;
		int potenciaNumero;
		System.out.println("Ingrese un numero entero: ");
		potencia = scanner.nextLine();
		potenciaNumero = Integer.parseInt(potencia);

		String cadenaCompuesta, resultadoCadenaCompuesta;
		cadenaCompuesta = w1.concat(w2);
		resultadoCadenaCompuesta = cadenaCompuesta;

		for (int i = 1; i < potenciaNumero; i++) {
			resultadoCadenaCompuesta = resultadoCadenaCompuesta.concat(cadenaCompuesta);
		}
		System.out.println("(w1w2)^" + potenciaNumero + " : " + resultadoCadenaCompuesta);
	}
}