

package bufferedreader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;



public class Buffered {

   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingreesa nombre");
        String nombre = br.readLine();
        System.out.println("Hola: "+nombre+" ahora ingresa edad");
        String edad = br.readLine();
        int edadEntera = Integer.parseInt(edad);
        System.out.println("Thanks "+nombre+" en seis años tendrás "+(edadEntera+6)+" años");  
    }
    
}
