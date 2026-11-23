package ejercicio2;

/**
 *@author [Pablo Adrian Carreño Granda]
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] numeros;
    double suma, promedio;
    int i;
    numeros = new double[10];
    suma = 0;
    for (i = 0; i < 10; i++) {
        System.out.println("Ingrese el numero para la posicion " + i + ":");
        numeros[i]= sc.nextDouble();
        suma = suma + numeros[i];
    }
    promedio = suma / 10;
    System.out.println("Suma total:" + suma);
    System.out.println("Promedio:" + promedio);
    }
}
