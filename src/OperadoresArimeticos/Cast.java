package OperadoresArimeticos;

public class Cast {
    public static void main(String[] args){
        //Cast
        int variableX = 50, variableY = 10;
        float variableZ = 5.5f;
        int resultado;
        float resultado1;

        resultado =  (int) (variableX + variableY + variableZ);
        System.out.println(resultado);

        resultado1 =  variableX + variableY + variableZ;
        System.out.println(resultado1);
    }
}
