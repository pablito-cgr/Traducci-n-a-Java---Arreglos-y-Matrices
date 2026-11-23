package ejercicio6;

/**
 *@author [Pablo Adrian Carreño Granda]
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz;
        int i, j;
        matriz = new int[3][4];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz ingresada:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}