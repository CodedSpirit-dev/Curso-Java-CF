package OperadoresArimeticos;// Este programa demuestra el uso de cadenas (Strings) en Java

class OperacionesConCadenas {
    public static void main(String[] args) {
        // Imprimimos un mensaje simple
        System.out.println("Hola, soy un string");

        // Declaración y asignación de una variable de tipo String
        String mensaje;
        mensaje = "  Hola, soy un string desde una variable  ";

        // Otra forma de declarar y asignar una variable de tipo String
        String mensaje2 = new String("Texto");
        System.out.println(mensaje);

        // Métodos de formato - Parte 1
        System.out.println(mensaje2.toUpperCase()); // Convierte a mayúsculas
        System.out.println(mensaje2.toLowerCase()); // Convierte a minúsculas
        System.out.println(mensaje.trim()); // Elimina espacios al inicio y final
        System.out.println(mensaje.trim().toUpperCase()); // Concatenación de métodos

        // Métodos de formato - Parte 2
        String mensaje3 = "";
        String curso = "DotNet";

        float valor = 10.88776f;

        mensaje3 = String.format(" Bienvenido al curso %s", "Java");
        String mensaje4 = String.format(" Bienvenido al curso %s", curso);
        String mensaje5 = String.format("Prueba %.2f", valor);

        System.out.println(mensaje3);
        System.out.println(mensaje4);
        System.out.println(mensaje5);

        mensaje5 = String.format("El total de %d articulos es %.4f %s", 3, valor, "MX");
        System.out.println(mensaje5);
        System.out.printf("El total de %d articulos es %.4f %s", 3, valor, "MX\n");

        // Formato de cadenas
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

        // Reordenar argumentos en el formato
        String uno = "Uno";
        String dos = "Dos";
        String tres = "Tres";

        String resultado4 = String.format("%3$s - %2$s - %1$s",
                uno, dos, tres);
        System.out.println(resultado4);

        // Especificar la posición del argumento en el formato
        float pi2 = 3.14159265359f;

        String resultado5 = String.format("%1f - Decimales: %1$.2f", pi2, pi2);
        System.out.println(resultado5);

        // Comparar cadenas
        String cadena1 = "Hola";
        String cadena2 = "Hola";

        boolean cadenaResultado1 = cadena1.equals(cadena2);
        System.out.println(cadenaResultado1);

        String cadena3 = "Hola";
        String cadena4 = "hola";

        String nuevaCadena3 = cadena3.toUpperCase();
        String nuevaCadena4 = cadena4.toUpperCase();

        boolean cadenaResultado2 = nuevaCadena3.equals(cadena4);
        System.out.println(cadenaResultado2);

        boolean cadenaResultado3 = cadena3.equalsIgnoreCase(cadena4);
        System.out.println(cadenaResultado3);


    }
}
