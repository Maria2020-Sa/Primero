package org.inicial;
import java.util.*; //importar paquete java.util

public class Secuencial {
    public static void main (String[] args){ //inicio del método main
        //declaración de variable
        int n1, n2;
        Scanner sc = new Scanner (System.in);
        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1= sc.nextInt(); //lee un entero por teclado
        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2= sc.nextInt(); //lee un entero por teclado

        //Mostrar resultado
        System.out.println("A introducido los números "+n1+" y "+n2);

    } //Fin del método main
}

//Dentro del paquete java.util, Scanner es una clase que nos permite obtener la entrada de datos primitivos.
// Esto quiere decir que podemos capturar datos del tipo int, double, string y etc.
//System.in para especificar la entrada de consola de teclado estándar
//también podemos pasar un objeto de clase File si queremos leer la entrada de un archivo