package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int LIMITE_PERSONAS = 8;
        final double LIMITE_PESO = 1000;

        int personas = 0;
        double pesoTotal = 0;
        double peso;

        System.out.println("---- Ascensor Inteligente de Carga ----");

        while (personas < LIMITE_PERSONAS && pesoTotal < LIMITE_PESO) {

            System.out.print("Ingrese el peso de la persona: ");
            peso = scanner.nextDouble();

            // No hay más personas
            if (peso == -1) {
                break;
            }

            // Verificar si supera el límite
            if (pesoTotal + peso > LIMITE_PESO) {
                System.out.println("La persona no puede subir.");
                System.out.println("Peso máximo excedido. Cerrando puertas de forma segura...");
                break;
            }

            // Subir persona
            pesoTotal += peso;
            personas++;

            System.out.println("Persona subida correctamente.");

            // Verificar si se llenó el ascensor
            if (personas == LIMITE_PERSONAS) {
                System.out.println("Cupo máximo de personas alcanzado.");
            }
        }

        // Resultados finales
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Personas que subieron: " + personas);
        System.out.println("Peso total real: " + pesoTotal + " kg");

        scanner.close();
    }
}

