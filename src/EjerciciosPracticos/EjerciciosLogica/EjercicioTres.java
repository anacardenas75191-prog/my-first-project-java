package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioTres {
           public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tipo de ejercicio : comparacion entre numeros en diferentes iteraciones 
        // Valor Cnetinela, Usuario digita numeros entre 0 y 9 por tanto no se puede inicializar en 0 
        int anterior2 = -1;
        int anterior1 = -1;
        boolean segura = true;
        String motivo = "";
        int ContadorDigitos = 0;

        System.out.println("---- Validador de Contraseña Bancaria ----");
        System.out.println("Ingrese dígitos uno a uno (negativo para terminar):");

        while (true) {
            System.out.print("Dígito: ");
            int digito  = sc.nextInt();
            if (digito  < 0) 
                break;

            ContadorDigitos++;

            if (ContadorDigitos  >= 3) {
                // Tres iguales consecutivos
                if ((digito == anterior1) && (anterior1 == anterior2)) {
                    segura = false;
                    motivo = "Tres dígitos iguales consecutivos (" + anterior2 + ", " + anterior1 + ", " + ContadorDigitos + ")";
                   break;
                }
                // Tres consecutivos ascendentes
                else if (digito == anterior1 + 1 && anterior1 == anterior2 + 1) {
                    segura = false;
                    motivo = "Secuencia consecutiva (" + anterior2 + ", " + anterior1 + ", " + ContadorDigitos + ")";
                    break;
                }
            }

            anterior2 = anterior1;
            anterior1 = digito;
        }

        System.out.println("\n ----RESULTADO ----");
        if (segura  && ContadorDigitos > 0) {
            System.out.println(" Contraseña SEGURA");
        } else if (!segura){
            System.out.println(" Contraseña INSEGURA");

            System.out.println("Motivo: " + motivo);
        }

        sc.close();
    }
}
