public class Scope {
    public static void main(String[] args) {
        // Se declara e inicializa una variable 'promedio' con el valor 6.
        int promedio = 6;

        // Se verifica si el valor de 'promedio' es mayor que 7.
        if (promedio > 7) {
            // Bloque de código ejecutado si 'promedio' es mayor que 7.

            // Se declara una variable 'mensaje' y se le asigna un valor.
            String mensaje = "Felicidades, tu promedio es de " + promedio;

            // Se verifica si el valor de 'promedio' es igual a 10 dentro de otro 'if'.
            if (promedio == 10) {
                // Bloque de código ejecutado si 'promedio' es igual a 10.

                // Se imprime el valor de 'mensaje'.
                System.out.println(mensaje);

                // Se declara una nueva variable 'mensaje2' dentro de otro bloque condicional.
                String mensaje2;

                // Se asigna un valor a 'mensaje2' (solo en este bloque).
                if (true) {
                    mensaje2 = "De esta nueva variable";
                }
                // El alcance de 'mensaje2' se extiende hasta el final del bloque que lo contiene.
            }
        }

        // Se imprime "Hola" fuera de todos los bloques condicionales.
        System.out.println("Hola");
        // Todas las variables declaradas en bloques condicionales no están disponibles aquí.
    }
}
