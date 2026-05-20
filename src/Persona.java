public class persona {
    // declara variables 
    static String nombre_persona = "ana";
    static String apellidps_persona = "cardenas";
     static int edad = 0;
    static char genero = 'f'  ;
    static float promedio_semestre = 3.9f 
    static boolean vive_manizales = true  

    // crear metodos adicionales 
        
     static void imprimirNombre (){}
        System.out.println(x:"informacion del estudiante:\nNombre completo" + nombre_persona + " " + apellidos_persona );

        
    }
    //Metodo que imprime la edad de la persona 
    static void imprimirEdad() {  
        System.out.println("Edad" + edad);
}
    // Metodo que imprime el promedio del semestre 
    static void imprimirPromedio (){  
         System.out.println ("promedio semestre" + promedio_semestre)

    // Metodo que verifica si vives en manizales 
    static void imprimirViveManzales(){
        if (vive_manizalesm == true ); {
            System.out.println(" vive en Manizales");
        }
        else {
            System.out.println("no vive en manizales");
        }
    }
    static void imprimirGenero(){ 
        if (genero == 'f');{ 
          System.out.println( "femenino ");
          }else if (genero == 'M');{
          System.out.println( "masculino  ");
         }else 
           System.out.println( "no binario "); }
    }
    public static void main(String[] args) {
        //llamar el metodo de la clase 
        imprimirNombre();
        imprimirEdad ();
        imprimirPromedio ();
        imprimirViveManzales();
    }
}   
