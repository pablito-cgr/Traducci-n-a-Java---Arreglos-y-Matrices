package ejercicio8;

/**
 *@author [Pablo Adrian Carreño Granda} 
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz;
    int i, j, sumaDiagonal;
    matriz = new int[4][4];
    sumaDiagonal = 0;
    for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
    System.out.print("Diagonal principal:");
    for (i = 0; i < 4; i++) {
            System.out.println("Posicion [" + i + "][" + i + "]: " + matriz[i][i]);
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }
    System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}