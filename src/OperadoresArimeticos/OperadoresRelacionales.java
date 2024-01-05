package OperadoresArimeticos;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        //Operadores relacionales
        int variable1 = 200, variable2 = 300;
        boolean resultado;

        resultado = variable1 == variable2;
        System.out.println(resultado);

        resultado = variable1 < variable2;
        System.out.println(resultado);

        resultado = variable1 > variable2;
        System.out.println(resultado);

        resultado = variable1 >= variable2;
        System.out.println(resultado);

        resultado = variable1 <= variable2;
        System.out.println(resultado);

        resultado = variable1 != variable2;
        System.out.println(resultado);
    }
}
