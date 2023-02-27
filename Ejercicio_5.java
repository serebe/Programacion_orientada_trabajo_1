
//ejercicio resuelto 17

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        float numero,area,perimetro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita el radio del circulo:");
        numero=entrada.nextFloat();
        area=(float) (Math.pow(numero,2)*Math.PI);
        perimetro=(float) (2*Math.PI*numero);
        System.out.println("El area del circulo es: "+
                area);
        System.out.println("El perimetro del circulo es: "+
                perimetro);
    } 
}