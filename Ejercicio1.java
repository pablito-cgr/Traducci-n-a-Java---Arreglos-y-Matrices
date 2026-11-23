package ejercicio1;

/**
 *@author [Pablo Adrian Carreño Granda]
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros;
    int i;
    numeros = new int[10];
    for (i = 0; i < 10; i++) {
        System.out.println("Ingrese el numero para la posicion " + i + ":");
        numeros[i] = sc.nextInt();
    }
    System.out.println("Valores almacenados:");
    for (i = 0; i < 10; i++) {
        System.out.println("Posicion" + i + ":" + numeros[i]);
    }
    }  
}