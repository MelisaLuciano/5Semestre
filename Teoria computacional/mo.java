/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Practica1 {

	/**
 	* @param args the command line arguments
 	*/
	public static void main(String[] args) {
    	// TODO code application logic here
    	String[] a = new String[100];
    	String[] b = new String[100];
    	Scanner sc = new Scanner(System.in);
    	String s;
        String t;
        String w;
        String q;
    	String res;
    	String aux;
   	 
    	System.out.println("Ingrese los caracteres para el primer alfabeto");
    	s = sc.nextLine();
        t = sc.nextLine();
        for (int i = 0; i <= s.length; i++);
        	System.out.println(s.charAt(i) + "=" + s.codePointAt(i));;
        w = sc.nextLine();
        q = sc.nextLine();
   	 
    	for (int i = 1; i <= s.length(); i++){
        	res = s.substring((i-1), i);             
        	if(res.equals("-")){
                    a[0] = s.substring((i-2), (i-1));
                    a[1] = s.substring((i));      
        	}
        	//break;
        	//System.out.println("Letra "+i+" : "+s.substring((i-1),i));
    	}
        
        for (int i = 1; i <= t.length(); i++){
        	res = t.substring((i-1), i);             
        	if(res.equals("-")){
                    b[0] = t.substring((i-2), (i-1));
                    b[1] = t.substring((i));      
        	}
        	//break;
        	//System.out.println("Letra "+i+" : "+s.substring((i-1),i));
    	}
        
        int h = 0;
        int j = 0;
        int k = 2;
        
        int o = 0;
        int p = 0;
        int u = 2;
        
        h = Integer.parseInt(a[0]);
        j = Integer.parseInt(a[1]);
        
        o = Integer.parseInt(b[0]);
        p = Integer.parseInt(b[1]);
        
        for (int i = h + 1; i <= j; i++){ 
            a[k] = Integer.toString(i);
            k++;
        }
        
        for (int i = o + 1; i <= p; i++){ 
            b[u] = Integer.toString(i);
            u++;
        }
        
        
            
            System.out.println(a[20]);
            System.out.println(b[3]);
	}
    
}