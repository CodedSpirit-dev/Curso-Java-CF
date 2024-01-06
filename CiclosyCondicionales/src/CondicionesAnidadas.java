public class CondicionesAnidadas {
    public static void main(String[] args) {
        int promedio = 6;

        if (promedio >= 7) {
            //El promedio es aprobatorio

            if (promedio == 10) {
                System.out.println("Muchas felicidades");
            } else {
                System.out.println("Felicidades");
            }
        } else {
            //El promedio no es aprobatorio
            System.out.println("Es necesario repasar bloques");
        }
    }
}