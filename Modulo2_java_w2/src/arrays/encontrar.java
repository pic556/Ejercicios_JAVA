package arrays;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Scanner;

public class encontrar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el largo del arreglo: ");
        int n = scan.nextInt();
        int[] vector = ArmadoDeArray(n);
        System.out.println("Introduce el número que quieres buscar: ");
        int a = scan.nextInt();
        boolean localizacion = encontrar(vector, a);
        if (localizacion) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }

    public static int[] ArmadoDeArray(int n) {
        int[] vector2 = new int[n];
        for (int i = 0; i < vector2.length; i++) {
            int num2 = (int) (Math.random() * 1000);
            vector2[i] = num2;
        }
        return vector2;
    }

    public static boolean encontrar(int[] vector, int a) {
        boolean verdad = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == a) {
                verdad = true;
                break;
            }
        }
        return verdad;
    }
}


