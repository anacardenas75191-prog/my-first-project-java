package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int oxigeno = 100;

        int dificultad;
        int dificultadAnterior = 0;

        boolean exito = true;

        System.out.println("---- La Cueva del Tesoro ----");

        // Recorrer 10 salas
        for (int sala = 1; sala <= 10; sala++) {

            System.out.print("Ingrese la dificultad de la sala " +
                    sala + " (1 a 5): ");

            dificultad = scanner.nextInt();

            // Consumo básico
            oxigeno -= dificultad * 3;

            // Consumo extra por agitación
            if (sala > 1 && dificultad > dificultadAnterior) {

                oxigeno -= 5;

                System.out.println(
                        "El explorador se agitó. -5 de oxígeno extra.");
            }

            // Mostrar oxígeno actual
            System.out.println("Oxígeno restante: " + oxigeno);

            // Verificar derrota
            if (oxigeno <= 0) {

                exito = false;

                System.out.println("\nEl explorador se quedó sin oxígeno.");
                break;
            }

            // Guardar dificultad anterior
            dificultadAnterior = dificultad;
        }

        // Resultado final
        System.out.println("\n----RESULTADO FINAL----");

        if (exito) {
            System.out.println(
                    "¡Éxito! El explorador atravesó las 10 salas.");
        } else {
            System.out.println(
                    "Fracaso. El explorador no logró completar el camino.");
        }

        System.out.println("Oxígeno restante: " + oxigeno);

        scanner.close();
    }
}

