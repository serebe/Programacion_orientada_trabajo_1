
//ejercicio resuelto 14

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita el numero:");
        numero=entrada.nextFloat();
        System.out.println("El numero a cuadrado es: "+
                Math.pow(numero,2));
        System.out.println("El numero a cuadrado es: "+
                Math.pow(numero,3));   
    }   
}
