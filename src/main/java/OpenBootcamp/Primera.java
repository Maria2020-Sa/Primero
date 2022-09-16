package OpenBootcamp;

public class Primera {
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.
    public static void main (String[] args){
        int total = 0;
        total = suma(2, 4, 8);
        System.out.println(total);
    }

    public static int suma (int a, int b, int c){
        return a + b + c;
    }
}

