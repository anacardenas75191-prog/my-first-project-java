package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioUno {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0, defectuosos = 0, total = 0;
        int consecutivosDefectuosos = 0;
        boolean emergencia = false;

        System.out.println("-----Control de Calidad - Fábrica de Dulces -----");
        System.out.println("Ingrese el peso de cada dulce (0 para terminar):");

        while (true) {
            System.out.print("Peso del dulce: ");
            double peso = sc.nextDouble();

            if (peso == 0) break;

            total++;
            if (peso < 8 || peso > 12) {
                defectuosos++;
                consecutivosDefectuosos++;
                System.out.println("  → Dulce DEFECTUOSO");
                if (consecutivosDefectuosos == 3) {
                    System.out.println("\n  ¡ DETENCION DE EMERGENCIA ! 3 defectuosos consecutivos.");
                    emergencia = true;
                    break;
                }
            } else {
                aprobados++;
                consecutivosDefectuosos = 0;
                System.out.println("  → Dulce aprobado");
            }
        }

        System.out.println("\n -----REPORTE FINAL -----");
        System.out.println("Total procesados : " + total);
        System.out.println("Aprobados        : " + aprobados);
        System.out.println("Defectuosos      : " + defectuosos);
        double porcentaje = total > 0 ? (defectuosos * 100.0 / total) : 0;
        System.out.printf("Porcentaje defec.: %.2f%%%n", porcentaje);
        if (emergencia) System.out.println("Motivo de cierre : EMERGENCIA");
        else            System.out.println("Motivo de cierre : Entrada manual (0)");

        sc.close();
    }
}
