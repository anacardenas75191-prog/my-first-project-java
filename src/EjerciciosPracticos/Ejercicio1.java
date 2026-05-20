package EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner var_teclado = new Scanner(System.in);

    static int contador_consecutivos = 0;

    static double temperatura = 0.0;
    public static void main(String[] args) {
        while(true) {
        System.out.println("Ingrese la T  ");
        temperatura = var_teclado.nextDouble();
       
        
        if (temperatura > 100){ 
           contador_consecutivos ++;
            System.out.println("-------- ALERTA TEMPERATURA ALTA---------");
            }
             if ( temperatura > 100 && contador_consecutivos ==3 ){ 
                System.out.println("-------ALARMA ACTIVADA------ ");
                break;

            }else  {
                if(contador_consecutivos>0) {
                    System.out.println("reiniciando contador");
                    contador_consecutivos= 0;
                }
                
            }

        }
        var_teclado.close();
     }
        
    }
 