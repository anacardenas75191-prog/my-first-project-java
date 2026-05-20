package EjerciciosPracticos.EjerciciosLogica;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo;
        int codigo;
        boolean bloqueada = false;
        int ultimoViaje = 0;

        System.out.println("---- Simulación de Tarjeta de Transporte ----");

        System.out.print("Ingrese el saldo inicial: $");
        saldo = scanner.nextDouble();

        while (true) {

            System.out.println("\nCódigos de viaje:");
            System.out.println("1. Autobús ($2,500)");
            System.out.println("2. Metro ($3,200)");
            System.out.println("3. Transbordo ($1,000)");
            System.out.println("4. Recargar saldo");
            System.out.println("0. Salir");

            System.out.print("Ingrese una opción: ");
            codigo = scanner.nextInt();

            // Finalizar programa
            if (codigo == 0) {
                break;
            }

            // Recarga de saldo
            if (codigo == 4) {

                System.out.print("Ingrese valor de recarga: $");
                double recarga = scanner.nextDouble();

                saldo += recarga;

                if (saldo > -4000) {
                    bloqueada = false;
                }

                System.out.println("Recarga realizada.");
                System.out.println("Saldo actual: $" + saldo);

                continue;
            }

            // Si está bloqueada
            if (bloqueada) {
                System.out.println("Tarjeta bloqueada.");
                System.out.println("Debe recargar saldo para continuar.");
                continue;
            }

            double costo = 0;

            switch (codigo) {

                case 1:
                    costo = 2500;
                    break;

                case 2:

                    // Descuento por dos metros seguidos
                    if (ultimoViaje == 2) {
                        costo = 1600;
                        System.out.println("Descuento aplicado en segundo metro consecutivo.");
                    } else {
                        costo = 3200;
                    }

                    break;

                case 3:
                    costo = 1000;
                    break;

                default:
                    System.out.println("Código inválido.");
                    continue;
            }

            // Descontar saldo
            saldo -= costo;

            System.out.println("Viaje realizado. Costo: $" + costo);
            System.out.println("Saldo actual: $" + saldo);

            // Verificar bloqueo
            if (saldo <= -4000) {
                bloqueada = true;
                System.out.println("La tarjeta ha sido BLOQUEADA por saldo negativo.");
            }

            // Guardar último viaje
            ultimoViaje = codigo;
        }

        System.out.println("\n=== PROGRAMA FINALIZADO ===");
        System.out.println("Saldo final: $" + saldo);

        scanner.close();
    }
}

