package talleres;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Test25sept {
    public static void main(String[]args){
        Random costo = new Random();
        Scanner empresa = new Scanner(System.in);
        
        int monto=0;
        int dia=0;
        float promedio = 0;
        int aux;
        
        System.out.println("Ventas registradas en el Mes:");
        System.out.println();
        System.out.println("Dias: ");
        int dias = 30;
        
        int mes[]= new int[dias];      
        
        System.out.println("Ventas de CD: ");
        for(int i=0; i<dias; i++){
            System.out.println("Día: "+(dia+1));
           
            for(int j=0; j<dias; j++){
                System.out.println("Ingrese la cantidad del monto por venta cancelada diarios: ");
                monto= costo.nextInt(500000);
                if(monto>=0){
                    System.out.println(monto+"\t");
                }
                System.out.println();
                aux = i;
                if(monto > 345000){
                    System.out.println("El Dia: "+aux+" se reunio el monto de: "+monto);    
                }
                System.out.println();
           
                }   
                if(dia == 15){
                    monto += mes[dias];
                }
                promedio += monto / dia;
                System.out.println();
                System.out.println("El Promedio de las primeras 15 ventas es de: "+promedio);
                
                int mayor_venta;
                int menor_venta;
                menor_venta = mayor_venta = mes[0];
             
                if(mes[i]>mayor_venta){
                    mayor_venta = mes[i];
                }
                if(mes[i]<menor_venta){
                    menor_venta = mes[1];
                }
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("La menor venta registro un total de: ");
                System.out.println(menor_venta);
                System.out.println("La mayor venta registro un total de: ");
                System.out.println(mayor_venta);
                System.out.println("--------------------------------");
            
        }
    }
}