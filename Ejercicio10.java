package ejercicio10;

/**
 *@author [Pablo Adrian Carreño Granda}
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz;
    int i, j, valor;
     matriz = new int[3][5];
      for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor para la fila " + i + " columna " + j + ": ");
                valor = sc.nextInt();
                matriz[i][j] = valor + (i * j);
            }
        }
       System.out.println("\nMatriz resultante:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}