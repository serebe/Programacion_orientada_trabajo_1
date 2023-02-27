
//ejercicio resuelto 4

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) { 
// se hace la aproximacion al entero debido a que no es normal
// decir la edad en numero decimal en caso de que no se proporcione
//  una division entera desde la division
       int juan,mama,alberto,ana;
       Scanner entrada = new Scanner(System.in); 
       System.out.println("¿cuantos años tiene Juan?");
       juan= entrada.nextInt();
       alberto= 2*(juan/3);
       ana=4*(juan/3);
       mama=ana+alberto+juan;
       System.out.println("Recordemos las edades de la familia "
               + "son las siguientes:");
       System.out.println("Juan tiene "+juan+" años");
       System.out.println("Alberto tiene "+alberto+" años");
       System.out.println("Ana tiene "+ana+" años");
       System.out.println("La Mamá de Juan tiene "+mama+" años"); 
    } 
}
