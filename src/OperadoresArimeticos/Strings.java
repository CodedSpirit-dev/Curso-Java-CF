package OperadoresArimeticos;

public class Strings {
    public static void main(String[] args){
        System.out.println("Hola, soy un string");

        String mensaje;
        mensaje = "Hola, soy un string desde una variable";

        String mensaje2 = new String("Texto");
        System.out.println(mensaje);

        //Metodos de formato parte 1
        System.out.println(mensaje2.toUpperCase()); // Este metodo devuelve el texto a mayusculas
        System.out.println(mensaje2.toLowerCase()); // Este metodo devuelve el texto a minusculas
    }
}
