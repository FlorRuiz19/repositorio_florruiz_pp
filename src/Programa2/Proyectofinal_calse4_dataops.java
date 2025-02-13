
package Programa2;

import java.util.Scanner;
public class Proyectofinal_calse4_dataops {
   public static void main(String[] args){
        // declarar variable
        String empleado;
        Double ht,th,dsn,sb,sn;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Nombre de empleado");
        empleado=lectura.next();
        System.out.println("Horas trabajadas");
        ht=lectura.nextDouble();
        System.out.println("Tarifa por Hora");
        th=lectura.nextDouble();
        //proceso de datos
        sb=ht*th;
        dsn=sb*0.13;
        sn=sb-dsn;
        //salidad de datos
        System.out.println("Sueldo bruto"+sb);
        System.out.println("Descuento"+dsn);
        System.out.println("Sueldo neto"+sn);
    }
    
}
