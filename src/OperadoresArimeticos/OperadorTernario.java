package OperadoresArimeticos;

public class OperadorTernario {
    public static void main(String[] args){
        //Operador ternario
        //Expresion 1 evalua booleano, si no, se usa la expresion 2, si no es ninguna entra la expresion 3 por defecto.
        //Si expresion 1 = true entonces expresion 2
        //Si expresion 1 = false entonces expresion 3
        String mensaje = 10 > 9 ? "Es mayor" : "Es menor";

        System.out.println(mensaje);

        int enteros = true ? 1 : 0;
        System.out.println(enteros);
    }
}
