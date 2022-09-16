package org.inicial;

public class HolaMundo{
    public static void main(String[] args){
        int resultado = 0;
        resultado = suma(4, 3); //PASO DE PARÁMETROS POR VALOR. DUPLICA EL VALOR EN MEMORIA

        System.out.println(resultado);
    }

    public static int suma (int a, int b) {
        return a + b;
    }
}


