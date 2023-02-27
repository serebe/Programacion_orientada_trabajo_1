
//ejercicio resuelto 12

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
       float salario,retencion,horas;
       Scanner entrada = new Scanner(System.in); 
       System.out.println("Hola empleado!, ¿Cuanto trabajaste?");
       horas=entrada.nextFloat();
       System.out.println("¿De cuanto es tu hora salario?");
       salario=entrada.nextFloat();
       System.out.println("¿De cuanto es tu retencion a la fuente(%)?");
       retencion=entrada.nextFloat();
       retencion=retencion/100;
       salario=salario*horas;
       retencion=retencion*salario;
       System.out.println("Recordemos:");
       System.out.println("Tu salario bruto es igual a $"+salario);
       System.out.println("Con una retencion a la fuente de $"+retencion);
       salario=salario-retencion;
       System.out.println("tu salario neto es $"+salario);
    }
}
