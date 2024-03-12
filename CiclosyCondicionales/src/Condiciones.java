public class Condiciones {
    public static void main(String[] args) {
        String colorLuz = "Amarillo";

        if (colorLuz.equals("Verde")) {
            System.out.println("Puede continuar");
        } else if (colorLuz.equals("Amarillo")) {
            System.out.println("Reduzca su velocidad");
        } else {
            System.out.println("Alto total");
        }

    }
}