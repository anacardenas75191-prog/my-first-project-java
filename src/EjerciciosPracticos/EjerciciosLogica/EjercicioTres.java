package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioTres {
           public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anterior2 = -1, anterior1 = -1;
        boolean segura = true;
        String motivo = "";
        int digitos = 0;

        System.out.println("---- Validador de Contraseña Bancaria ----");
        System.out.println("Ingrese dígitos uno a uno (negativo para terminar):");

        while (true) {
            System.out.print("Dígito: ");
            int d = sc.nextInt();
            if (d < 0) break;

            digitos++;

            if (digitos >= 3) {
                // Tres iguales consecutivos
                if (d == anterior1 && anterior1 == anterior2) {
                    segura = false;
                    motivo = "Tres dígitos iguales consecutivos (" + d + ", " + d + ", " + d + ")";
                    break;
                }
                // Tres consecutivos ascendentes
                if (d == anterior1 + 1 && anterior1 == anterior2 + 1) {
                    segura = false;
                    motivo = "Secuencia ascendente consecutiva (" + anterior2 + ", " + anterior1 + ", " + d + ")";
                    break;
                }
            }

            anterior2 = anterior1;
            anterior1 = d;
        }

        System.out.println("\n ----RESULTADO ----");
        if (segura) {
            System.out.println(" Contraseña SEGURA");
        } else {
            System.out.println(" Contraseña INSEGURA");
            System.out.println("Motivo: " + motivo);
        }

        sc.close();
    }
}
