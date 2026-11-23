package ejercicio4;

/**
 *@author {Pablo Adrian Carreño Granda]
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros;
    int i, cantPares, cantImpares, sumaPares, sumaImpares;
    numeros = new int[20];
    cantPares = 0;
    cantImpares = 0;
    sumaPares = 0;
    sumaImpares = 0;
    for (i = 0; i < 20; i++) {
        System.out.println("Ingrese el numero para la posicion " + i + ":");
        numeros[i] = sc.nextInt();
        if (numeros[i] % 2 == 0) {
            cantPares++;
            sumaPares = sumaPares + numeros[i];
        } else {
            cantImpares++;
            sumaImpares = sumaImpares + numeros[i];
        }
    }
    System.out.println("Cantidad de pares:" + cantPares);
    System.out.println("Cantidad de impares:" + cantImpares);
    System.out.println("Suma de los pares:" + sumaPares);
    System.out.println("Suma de los impares:" + sumaImpares);
    } 
}