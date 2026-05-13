
public class Vehiculo {
    /*
     * atributos: marca, velocidad, encendido
     * metodos: encender(), apagara(), acelerar(), frenar(), mostraEstadoPedido(),
     */
    static String marca = "Mazda";
    static int velocidad = 15;
    static boolean encendido = false;

    static void encender() {
        // if (encendido == true) {

        if (encendido == false && velocidad > 0) {
            System.out.println("Encendido");
        } else {
            System.out.println("Apagado");
        }

    }

    static void apagar(){
        // no se puede apagar si ya esta apagado 
     static void apagar() {
      if(!encendido)
        System.out.println("El vehiculo ya esta apagado ");
     } else if (velocidad > 0 ); {
        System.out.println(" Vehiculo en movimiento ");
    
     } else if (velocidad < 0 ){
        System.out.println("valor invalido");
      }else 
        System.out.println() 
         
       }
       }

       static void acelerar (){
        if (!encendido){
            velocidad =0;

        }
       }

    public static void main(String[] args) {
        encender();
    }
}
