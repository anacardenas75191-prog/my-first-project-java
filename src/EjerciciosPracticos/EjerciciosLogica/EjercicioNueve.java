package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int anterior;
        int actual;
        int siguiente;

        int picos = 0;

        System.out.println("----Detector de Picos ----");

        // Leer los dos primeros valores
        System.out.print("Ingrese la frecuencia 1: ");
        anterior = scanner.nextInt();

        System.out.print("Ingrese la frecuencia 2: ");
        actual = scanner.nextInt();

        // Desde la tercera medición hasta la 15
        for (int i = 3; i <= 15; i++) {

            System.out.print("Ingrese la frecuencia " + i + ": ");
            siguiente = scanner.nextInt();

            // Verificar si la medición actual es un pico
            if (actual > anterior && actual > siguiente) {
                picos++;
            }

            // Desplazar valores
            anterior = actual;
            actual = siguiente;
        }

        // Resultado final
        System.out.println("\n ----RESULTADO----");
        System.out.println("Cantidad total de picos detectados: " + picos);

        scanner.close();
    }
}

