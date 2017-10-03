package talleres;
import java.util.Scanner;
public class Taller3 {

    public static void main(String[] args) {
        
        Scanner dinero = new Scanner(System.in);
        
        int horas_diarias;
        int cant_ventas;
        int monto_venta;
                
        int trabajo_mensual = 4; 
        int trabajo_semana;
        
        int dias = 1;
        int ventas = 1;
        int semana = 1;
        
        int horas_extras = 0;
        int hora_semanal = 0;
        
        float bono = 0;
        float pago_extra = 0;
        float sueldo_diario = 0;
        float sueldo_semanal = 0;
        float sueldo_mensual = 0;
        
        System.out.println("Fin de Mes");
        System.out.println("------------------------------");
        for (int i=1; i<=trabajo_mensual; i++){
            System.out.println("Dias Trabajados en la Semana: "+semana++);
            trabajo_semana = dinero.nextInt();
            for (int j=1; j<=trabajo_semana; j++){
                System.out.println("Horas trabajadas en el dia: "+dias++);
                horas_diarias = dinero.nextInt();
                
                if(hora_semanal <= 40){
                    sueldo_diario += (horas_diarias * 2000);
                }else if (40 < hora_semanal){
                    horas_extras += (hora_semanal - 40);
                    pago_extra += (horas_extras * 3000);
                    sueldo_diario += (pago_extra + (horas_diarias * 2000));
                }   
            }
            sueldo_semanal += (sueldo_diario);
            System.out.println("------------------------------");
            System.out.println("Ingrese las Ventas del Vendedor: ");
            cant_ventas =dinero.nextInt();
                
            for(int k=1; k<=cant_ventas; k++){
                System.out.println("Ingrese los montos de las ventas: "+ventas++);
                monto_venta= dinero.nextInt();
                
                if(monto_venta >=300000){
                    bono = bono;
                }else if (300000 < monto_venta && monto_venta<= 500000){
                    bono += (monto_venta * 0.05)+sueldo_semanal;
                }else if (500000 < monto_venta){
                    bono += (monto_venta * 0.1)+sueldo_semanal;
                }
            }
            sueldo_mensual += (bono + sueldo_semanal);           
            
            System.out.println("El sueldo semanal es de: $"+sueldo_semanal);
            System.out.println("------------------------");
            System.out.println("------------------------");
        }
        System.out.println("El sueldo semanal es de: $"+sueldo_semanal);
        System.out.println("Y el sueldo mensual que recive el vendedor es de: $"+sueldo_mensual);
    }
}