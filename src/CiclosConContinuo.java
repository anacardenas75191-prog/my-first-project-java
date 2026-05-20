public class CiclosConContinuo {
 public static void main(String[] args) {
    System.out.println("--------Envio material clase----------");
for(int estudiante = 1; estudiante <= 16;estudiante++) {
    System.out.println("estudiante # "+ estudiante);
     if (estudiante==11){
        System.out.println("Estudiante PERDIO ASIGNATURA");
        continue;
     }
    System.out.println("Alumno #" + estudiante + "enviando material...");
}
  System.out.println("Envio finalizado ");
}
}