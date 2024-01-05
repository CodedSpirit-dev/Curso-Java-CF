package OperadoresArimeticos;

public class Main {
    public static void main(String[] args) {
        //Opereadores artimeticos
        int variableX = 50, variableY = 10;
        int resultado;

        resultado = variableX + variableY;
        System.out.println(resultado);

        resultado = variableX - variableY;
        System.out.println(resultado);

        resultado = variableX * variableY;
        System.out.println(resultado);

        resultado = variableX / variableY;
        System.out.println(resultado);

        variableX ++;
        System.out.println(variableX);

        variableX--;
        System.out.println(variableX);

        variableX += 100;
        System.out.println(variableX);

        variableX -= 100;
        System.out.println(variableX);

        variableX *= 3;
        System.out.println(variableX);

        variableX /= 3;
        System.out.println(variableX);
    }
}
