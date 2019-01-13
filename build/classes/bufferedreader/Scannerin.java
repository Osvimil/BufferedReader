
package bufferedreader;

import java.util.Scanner;



public class Scannerin {
    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Ingresa nombre");
           String nombre = sc.nextLine();
           System.out.println("Hola "+nombre+" ahora ingresa edad: ");
           Integer edad = sc.nextInt();
           System.out.println("Muchas gracias "+nombre+" tu edad en cinco años será de "+(edad+5)+" años");
           
          
    }
    
   
    
}
