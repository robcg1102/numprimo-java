
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        try {
            int numero = leer.nextInt();
            System.out.println("===========================");
            if (esPrimo(numero)) {
                System.out.println("El numero es primo!");
            } else {
                System.out.println("El numero no es primo!");
            }
            System.out.println("===========================");
        } catch (Exception e) {
            System.out.println("===========================");
            System.out.println("Tienes que ingresar un numero entero!!");
            System.out.println("===========================");
        }
    }

    static boolean esPrimo(int numero) {

        int contador = 0;
        int[] numeros = new int[numero];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int i : numeros) {
            if (i == 1 || i == numero) {
                continue;
            }

            if (numero % i == 0) {
                contador++;
            }
        }
        return contador == 0;
    }
}
