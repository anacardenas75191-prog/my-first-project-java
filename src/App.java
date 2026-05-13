public class App {
    // variables globales de la clase 
    
    static String nombre_estudiante = "Ana Sofia";
    static  int edad = 18;
    static float peso  = 51.5f;
    static boolean estudiante_activo = true;
    static String  texto_estudaiante_activo ="";

public static  void main(String[] args) {
  if (estudiante_activo) {
 texto_estudaiante_activo = "si ";
 texto_estudaiante_activo = "no";
}  
 System.out.println(nombre_estudiante+" "+ edad +" "+ peso);
 System.out.println(nombre_estudiante "\n" + edad +"\n "+ peso);
 System.out.println(nombre_estudiante "\n" + edad +"\n "+ peso);

System.out.println("me llamo " + nombre_estudiante "tengo" + edad + "años y peso " + peso "kg");
System.out.println ("estudiante_activo" +texto_estudaiante_activo )
}  
}
