package OperadoresArimeticos;

public class OperadoresLogicos {
    public static void main(String[] args){
    //Operadores logicos and(&&), or(), not

        boolean resultado;

        resultado = 5>=5 && true;
        System.out.println(resultado);

        resultado = 5>=5 && true && 10 > 9;
        System.out.println(resultado);

        resultado = 5>=5 && true && 10 > 9;
        System.out.println(resultado);

        resultado = false || false || false || true; //Basta con que solo un resultado sea verdadero para que toda la expresion lo sea
        System.out.println(resultado);

        resultado = (5 >= (2*3) || true) && (true && 10 > 5);
        System.out.println(resultado);

        System.out.println(!false);
        //Si se emplea negacion se invierte el valor resultante
    }
}
