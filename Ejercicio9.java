package ejercicio9;

/**
 *@author {Pablo Adrian Carreño Granda}
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz;
    int i, j, mayor, menor;
     matriz = new int[5][5];
     for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor para la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
     mayor = matriz[0][0];
     menor = matriz[0][0];
     for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
     System.out.println("Mayor valor: " + mayor);
     System.out.println("Menor valor: " + menor);
    }
}