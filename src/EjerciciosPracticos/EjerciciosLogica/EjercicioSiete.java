package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char resultado;

        int puntos = 0;

        int rachaInvicto = 0;
        int mayorRachaInvicto = 0;

        int rachaDerrotas = 0;
        int peorRachaDerrotas = 0;

        System.out.println("----Contador de Rachas de Fútbol----");

        // 20 partidos
        for (int i = 1; i <= 20; i++) {

            System.out.print("Ingrese resultado del partido " + i +
                    " (G = Ganado, E = Empatado, P = Perdido): ");

            resultado = scanner.next().toUpperCase().charAt(0);

            switch (resultado) {

                case 'G':

                    puntos += 3;

                    rachaInvicto++;
                    rachaDerrotas = 0;

                    break;

                case 'E':

                    puntos += 1;

                    rachaInvicto++;
                    rachaDerrotas = 0;

                    break;

                case 'P':

                    rachaDerrotas++;
                    rachaInvicto = 0;

                    break;

                default:

                    System.out.println("Resultado inválido.");
                    i--; // repetir partido
                    continue;
            }

            // Actualizar mayor racha invicta
            if (rachaInvicto > mayorRachaInvicto) {
                mayorRachaInvicto = rachaInvicto;
            }

            // Actualizar peor racha de derrotas
            if (rachaDerrotas > peorRachaDerrotas) {
                peorRachaDerrotas = rachaDerrotas;
            }
        }

        // Resultados finales
        System.out.println("\n ----RESULTADOS ----");
        System.out.println("Puntos totales: " + puntos);
        System.out.println("Mayor racha invicta: " +
                mayorRachaInvicto + " partidos");
        System.out.println("Peor racha de derrotas consecutivas: " +
                peorRachaDerrotas + " partidos");

        scanner.close();
    }
}

