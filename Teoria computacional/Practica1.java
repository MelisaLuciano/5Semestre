import java.util.Scanner;

/**
*
* @author Melisa y Cesar :3
*/
public class Practica1 {
/**
* @param args the command line arguments
*/
    public static void main(String[] args) {
    	System.getProperty("line.separator");
        int bandera = 0;
        do{
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
        System.out.println("*****************************************************************");
        System.out.println("\t*Programa de implementacion de alfabetos y cadenas*\t");
        System.out.println("\t Si son letras insertar con minusculas\t\n\n");
        System.out.println("Ingrese los rangos para el primer alfabeto ");
        rangoAlfabeto1 = scanner.nextLine();
        System.out.println("Ingrese los rangos para el segundo alfabeto ");
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
            System.out.println("\nIngrese una cadena perteneciente al primer alfabeto");
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
                    System.out.println("\nEl caracter " + aux + " no pertenece al alfabeto");
                    flag ++;
                }					
            }

        } while(flag != 0);

        String aux2;
        do{
            System.out.println("\nIngrese una cadena perteneciente al segundo alfabeto");
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
                    System.out.println("\nEl caracter " + aux2 + " no pertenece al alfabeto");
                    flag ++;
                }	
            }

        }while(flag != 0);

        //(W1W2)^N----------------------------------------------------------------------------------------
        String potencia;
        int potenciaNumero;
        System.out.println("\ng) Para (w1w2)^n, ingrese el valor de 'n' ");
        potencia = scanner.nextLine();
        potenciaNumero = Integer.parseInt(potencia);

        String cadenaCompuesta, resultadoCadenaCompuesta;
        cadenaCompuesta = w1.concat(w2);
        resultadoCadenaCompuesta = cadenaCompuesta;

        for (int i = 1; i < potenciaNumero; i++) {
            resultadoCadenaCompuesta = resultadoCadenaCompuesta.concat(cadenaCompuesta);
        }
        System.out.println("\n(w1w2)^" + potenciaNumero + " : " + resultadoCadenaCompuesta);
                
        //|W1|() CUANTAS LETRAS HAY EN LA CADENA
        int ciclo = 1;
        do{
        String caracter;
        int numChar;
        int numeroRep = 0;
        System.out.println("\nIngresa un caracter perteneciente a la cadena w1(" + w1 + ")");
        caracter = scanner.nextLine();
                
        for (int i = 0; i < w1.length(); i++) {
            numChar = caracter.codePointAt(0);
            if (i < w1.length()) {
                aux2 = w1.substring(i, (i + 1));	
            } else{
                aux2 = w1.substring(i); 
            }
            a1 = aux2.codePointAt(0);
            if (numChar == a1) {
                numeroRep ++;
            }
        }
            
        if (numeroRep != 0) {
            System.out.println("|w1|(" + caracter + "): " + numeroRep);
            ciclo = 0;
        } else{
            System.out.println("\nEl caracter " + caracter + " no esta en la cadena w1(" + w1 + ")\n");
        }
    }while(ciclo != 0);
                
        
        //System.out.println(indiceAlfabeto1);
        //System.out.println(indiceAlfabeto2);
               
        int indiceAlfabeto3 = indiceAlfabeto1 * indiceAlfabeto2 * indiceAlfabeto1;
        String [] cc = new String[indiceAlfabeto3];
        String auxiliar;
        int h = 0;
                
        System.out.println("\nLa concatenacion de los alfabetos (a)(b): \n");
        for (int i = 0; i < indiceAlfabeto1 ; i++) {
            for (int j = 0; j < indiceAlfabeto2; j++) {
                auxiliar = a[i].concat(b[j]);
                cc[h] = auxiliar;
                //System.out.println(cc[h]);
                h++;
            }
        }

        System.out.println(h);
        
        h = 0;
        
        System.out.println("\nLa concatenacion de los alfabetos (a)(b)(a): \n");
        for (int i = 0; i < indiceAlfabeto1 ; i++) {
            for (int j = 0; j < indiceAlfabeto2; j++) {
                for (int k = 0; k < indiceAlfabeto1; k++) {
                    auxiliar = a[i].concat(b[j]);
                    cc[h] = auxiliar.concat(a[k]);
                    //System.out.println(cc[h]);
                    h++;
                }
            }
        }
        
        System.out.println(h);
                
        //PREFIJO, SUFIJO Y SUBCADENA
                
        String inicial;
        String piv;
        String niu = "";
        int[] indices = new int[10];
        String[] palabras = new String[10];
        int cont = 0;
        inicial = w2.substring(0 , 1);
                            
        for (int i = 0; i < w1.length(); i++) {
            if (i < w1.length()) {
                piv = w1.substring(i, (i + 1));	
            } else{
                piv = w1.substring(i); 
            }
                    
            if (inicial.equals(piv)) {
                indices[cont] = i;
                cont ++;
            }
        }
                
        for (int i = 0; i < cont; i++) {
            if (!((indices[i] + w2.length()) > w1.length())) {
                palabras[i] = w1.substring(indices[i] , (indices[i] + w2.length()));   	
            }
        }
        
           for (int i = 0; i < cont; i++) {
                if (w2.equals(palabras[i]) && indices[i] == 0) {
                    System.out.println("\nw2: '" + palabras[i] + "' es un PREFIJO de w1");
                    break;
                } else if (w2.equals(palabras[i]) && (indices[i] + (w2.length() - 1)) == (w1.length() - 1)){
                    System.out.println("\nw2: '" + palabras[i] + "' es un SUFIJO de w1");
                    break;
                } else if (w2.equals(palabras[i])){
                    System.out.println("\nw2: '" + palabras[i] + "' es una SUBCADENA de w1");
                    break;
                } else if(w2.equals(w1)){
                    System.out.println("\nw1 y w2 son IGUALES");
                    break;
                }
            }
        }while(bandera != 0);     
    }
}