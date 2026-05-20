package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precioBase;
        double oferta;
        double ofertaMayor;

        int ofertasValidas = 0;

        System.out.println("----Juego de la Subasta Ciega ----");

        // Precio base
        System.out.print("Ingrese el precio base del artículo: ");
        precioBase = scanner.nextDouble();

        ofertaMayor = precioBase;

        // Proceso de ofertas
        while (true) {

            System.out.print("Ingrese una oferta (0 para finalizar): ");
            oferta = scanner.nextDouble();

            // Finalizar subasta
            if (oferta == 0) {
                break;
            }

            // Validar oferta
            if (oferta > ofertaMayor) {

                ofertaMayor = oferta;
                ofertasValidas++;

                System.out.println("Oferta aceptada.");

            } else {

                System.out.println("Oferta insuficiente.");
            }
        }

        // Resultados finales
        System.out.println("\n ----RESULTADOS ----");
        System.out.println("Precio final de venta: $" + ofertaMayor);
        System.out.println("Total de ofertas válidas: " + ofertasValidas);

        scanner.close();
    }
}

