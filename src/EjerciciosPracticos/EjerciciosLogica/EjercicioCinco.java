package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroOriginal;
        int numero;
        int invertido = 0;
        int digito;

        System.out.println("---- Reconstructor del Número Invertido ----45667");

        System.out.print("Ingrese un número entero positivo: ");
        numeroOriginal = scanner.nextInt();

        numero = numeroOriginal;

        // Construir el número invertido matemáticamente
        while (numero > 0) {

            digito = numero % 10;

            invertido = invertido * 10 + digito;

            numero = numero / 10;
        }

        // Mostrar resultado
        System.out.println("Número invertido: " + invertido);

        // Verificar si es palíndromo
        if (numeroOriginal == invertido) {
            System.out.println("El número es un palíndromo.");
        } else {
            System.out.println("El número NO es un palíndromo.");
        }

        scanner.close();
    }
}

