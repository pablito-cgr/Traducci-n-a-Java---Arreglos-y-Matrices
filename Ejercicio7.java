package ejercicio7;

/**
 *@author [Pablo Adrian Carreño Granda]
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz;
    int i, j, suma;
    matriz = new int[4][4];
    suma = 0;
    for ( i = 0; i < 4; i++) { 
        for (j = 0; j < 4; j++) {
            System.out.print("Ingrese el valor para la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
                suma = suma + matriz[i][j];
        }
    }
     System.out.println("\nSuma total de los elementos: " + suma);
    }
}