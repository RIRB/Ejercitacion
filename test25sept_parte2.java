package talleres;
import java.util.Random;
public class test25sept_parte2 {
    public static void main(String[]args){
        Random numeros = new Random();
    
    //ENTRADA
        //se define ya por consola la dimension de la matriz    
        System.out.println("Dimensiones de la Matriz: ");
        int filas= 4;
        System.out.println("      "+filas);
        System.out.println("      x");
        int columnas= 4;
        System.out.println("      "+columnas);
        
        filas = columnas;
        //se crea la matriz
        int matriz[][] = new int[filas][filas];
    //DESARROLLO    
        //se recorre la matriz
        System.out.println(" -- MATRIZ --");
        for(int i=0; i<filas; i++){
            for(int j=0; j<filas; j++){   
                System.out.print("Posicion ["+(i)+"]"+":"+"["+(j)+"]=");
            
            //se le dan valor aleatorios a cada posicion de la matriz      
                matriz[i][j] = numeros.nextInt(49);
                System.out.print(matriz[i][j]+" \t");
            }
            System.out.println();
        }   
        //se comienza a buscar los datos de la diagonal en la matriz
        int diagonal[]= new int[filas];
        for(int i=0; i<filas; i++){
                diagonal[i]=matriz[i][i];     
            }
        System.out.println();
        System.out.println("----------------------");
        System.out.println("--Diagonal Principal--");
        System.out.println("----------------------");
        int principal=0;
        //se escriben los datos de la diagonal
        for(int i=0; i<filas; i++){
            System.out.println("\t "+ diagonal[i]);
            //principal pasa a ser el arreglo de la diagonal
            principal += diagonal[i];
        }
        //se crea un contador inicializado en 0 para que guarde los numero de la diagonal
        //se suma el cont con la variable principal, la cual posee los valores de la diagonal
        int cont=0;
    //SALIDA
        cont += principal;
        //y para el final, se imprime el resutaldo de la diagonal
        System.out.println("-------------------------------------------");
        System.out.println("La suma de la diagonal Principal es de: "+cont);
    }
}