public class CiclosConBreack {
    // Revisar alchivos y salir de el ciclo una vez encuentre el archivo malicioso 
    public static void main(String[] args) {
        System.out.println("--------iniciando escaneo de seguridad-------");

    // for(int archivo = 1; archivo <= 10; archivo++){}
      for(int archivo = 1; archivo <= 10; archivo++){
        System.out.println("Archivo #"+ archivo);
        // condiciion si el archivo es el 4 
         if (archivo==4 ){
            System.out.println("Alerta. nEl archivo #" + archivo + "esta corrupto ");
          break;
         }
         System.out.println("archivo # " + archivo +"analizado.");
      }
      System.out.println("--------Escaneo Finslizado-------");
}

}
