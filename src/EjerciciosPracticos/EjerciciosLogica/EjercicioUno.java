package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioUno {
  
    public static void main(String[] args) {
         Scanner scanner  = new Scanner(System.in);

        int aprobados = 0; 
        int defectuosos = 0; 
        int total = 0;
        int consecutivosDefectuosos = 0;
        boolean alerta = false;

        System.out.println("-----Control de Calidad - Fábrica de Dulces -----");
        System.out.println("Ingrese el peso de cada dulce (0 para terminar):");

        while (true) {
            System.out.print("Peso del dulce: ");
            double peso = scanner.nextDouble();

            if (peso == 0){
                 break;
            }
            total++;
            if ((peso < 8 || peso > 12) ){
                defectuosos++;
                consecutivosDefectuosos++;
                System.out.println(" DULCE DEFECTUOSO");
                if (consecutivosDefectuosos == 3) {
                    System.out.println("\n  ¡ DETENCION DE EMERGENCIA ! 3 defectuosos consecutivos.");
                    alerta  = true;
                    break;
                }
            } else {
                aprobados++;
                consecutivosDefectuosos = 0;
                System.out.println(" Dulce aprobado");
            }
        }
         
        System.out.println(" ----- FINAL -----");
        System.out.println("Total procesados : " + total);
        System.out.println("Aprobados        : " + aprobados);
        System.out.println("Defectuosos      : " + defectuosos);
        System.out.println("% defectuosos"+(((defectuosos  * 100 ) / total) + "%" ));
     

        scanner .close();
    }
}
