package ejercicio3;

/**
 *@author {Pablo Adrian Carreño Granda]
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros;
    int mayor, menor, i , posMayor, posMenor;
    numeros = new int[15];
    for (i = 0; i < 15; i++) {
        System.out.println("Ingrese el numero para la posicion " + i + ":");
        numeros[i] = sc.nextInt();
    }
        mayor = numeros[0];
        menor = numeros[0];
        posMayor = 0;
        posMenor = 0;
    for (i = 1; i < 15; i++) {
        if (numeros[i] > mayor) {
            mayor = numeros[i];
            posMayor = i;
        }
        if (numeros[i] < menor) {
            menor = numeros[i];
            posMenor = i;
        }
    }
    System.out.println("Numero mayor:" + mayor);
    System.out.println("Posicion del mayor:" + posMayor);
    System.out.println("Numero menor:" + menor);
    System.out.println("Posicion del menor:" + posMenor);
    }
}
