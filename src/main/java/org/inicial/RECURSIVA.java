package org.inicial;

public class RECURSIVA {
//una función recursiva es la que se invoca a si misma.
    public static void main (String [] args){
        suma (3,5);
    }

    public static int suma (int a, int b){
        int resultado= a + b;
        System.out.println(resultado);

        return suma(a, resultado);
    }
}
//CALLBACK es asignar el nombre de una función a una variable y
// llamar indirectamente a la función a través de la variable.
//En jaba los callback como tal no existen, pero se puede implementar por INTERFASES.
// mivariable = funcion;
// mivariable();