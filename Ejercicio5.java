package ejercicio5;

/**
 *@author {Pablo Adrian Carreño Granda}
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        int i, valor;
        numeros = new int[12];
        for (i = 0; i < 12; i++) {
            do {
                System.out.println("Ingrese un numero positivo para la posicion " + i + ":");
                valor = sc.nextInt();
                if (valor <= 0) {
                    System.out.println("Error: el numero debe ser positivo");
                }
            } while (valor <= 0);
            numeros[i] = valor + i;
        }
        System.out.println("Arreglo final:");
        for (i = 0; i < 12; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }   
}