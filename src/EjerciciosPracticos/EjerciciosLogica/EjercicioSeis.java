package EjerciciosPracticos.EjerciciosLogica;

 import java.util.Scanner;

  public class EjercicioSeis {

      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double humedad;
        int minutosRiego = 0;

        int estresSeguido = 0;
        boolean estresCritico = false;

        System.out.println("---- Sistema de Riego Automatizado ----");

        System.out.print("Ingrese la humedad inicial del suelo (0 - 100): ");
        humedad = scanner.nextDouble();

        // Simulación de 24 minutos
        for (int minuto = 1; minuto <= 24; minuto++) {

            System.out.println("\nMinuto " + minuto);
            System.out.println("Humedad actual: " + humedad + "%");

            // Verificar estrés hídrico
            if (humedad < 15) {
                estresSeguido++;

                if (estresSeguido > 2) {
                    estresCritico = true;
                }

            } else {
                estresSeguido = 0;
            }

            // Activar riego
            if (humedad < 40) {

                System.out.println("Riego ACTIVADO");
                minutosRiego++;

                humedad = humedad + 5;

            }
            // Apagar riego y evaporación
            else if (humedad > 60) {

                System.out.println("Riego APAGADO");
                humedad = humedad - 3;

            }
            // Humedad óptima
            else {

                System.out.println("Humedad en nivel óptimo");
            }

            // Evitar valores inválidos
            if (humedad > 100) {
                humedad = 100;
            }

            if (humedad < 0) {
                humedad = 0;
            }
        }

        // Resultados finales
        System.out.println("\n ----RESULTADOS ----");
        System.out.println("Minutos totales de riego encendido: " + minutosRiego);

        if (estresCritico) {
            System.out.println("Hubo estrés hídrico crítico.");
        } else {
            System.out.println("No hubo estrés hídrico crítico.");
        }

        scanner.close();
    }
}

