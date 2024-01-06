package OperadoresArimeticos;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Hola, soy un string");

        String mensaje;
        mensaje = "  Hola, soy un string desde una variable  ";

        String mensaje2 = new String("Texto");
        System.out.println(mensaje);

        //Metodos de formato parte 1
        System.out.println(mensaje2.toUpperCase()); // Este metodo devuelve el texto a mayusculas
        System.out.println(mensaje2.toLowerCase()); // Este metodo devuelve el texto a minusculas
        System.out.println(mensaje.trim()); // Elimina los espacios al inicio y final del texto.
        System.out.println(mensaje.trim().toUpperCase()); // Concatenacion de metodos

        //Metodos de formato parte 2
        String mensaje3 = "";
        String curso = "DotNet";

        float valor = 10.88776f;

        mensaje3 = String.format(" Bienvenido al curso %s", "Java"); //Genera un nuevo String a partir de este formato donde %s es reemplazado por "Java"
        String mensaje4 = String.format(" Bienvenido al curso %s", curso); //Genera un nuevo String a partir de este formato donde %s es reemplazado por "DotNet"
        String mensaje5 = String.format("Prueba %.2f", valor); //Aqui se indica cuantos decimales mostrar

        System.out.println(mensaje3);
        System.out.println(mensaje4);
        System.out.println(mensaje5);

        mensaje5 = String.format("El total de %d articulos es %.4f %s", 3, valor, "MX"); //Formateo usando determinadas variables
        /* d = enteros
         * f = flotantes
         * s = string
         */
        System.out.println(mensaje5);
        System.out.printf("El total de %d articulos es %.4f %s", 3, valor, "MX\n"); //printf imprime formateado por defecto, esto si no queremos hacer cambios en la variable

        //Format string
        String nombre = "Codi";
        String apellido = "Facilito";

        String nombreCompleto = String.format("%s %s", nombre, apellido);
        System.out.println(nombreCompleto);

        String resultado = String.format("%d - %d - %d", 10, 20, 30);
        System.out.println(resultado);

        float pi = 3.14159265359f;

        String resultado2 = String.format("%f - Decimales: %.2f", pi, pi);
        System.out.println(resultado2);

        int cantidad = 10;
        boolean mayor = cantidad > 5;

        String resultado3 = String.format("La cantidad es mayor a %d : %b",
                cantidad, mayor);
        System.out.println(resultado3);

        String uno = "Uno";
        String dos = "Dos";
        String tres = "Tres";

        String resultado4 = String.format("%3$s - %2$s - %1$s",
                uno, dos, tres);
        System.out.println(resultado4);

        float pi2 = 3.14159265359f;

        String resultado5 = String.format("%1f - Decimales: %1$.2f", pi2, pi2);
        System.out.println(resultado5);
    }
}
