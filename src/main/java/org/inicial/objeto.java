package org.inicial;

public class objeto {

    public static void main (String[] args){
        Potato mipotato = new Potato ();
        //PASO DE PARÁMETROS POR REFERENCIA, NO UTILIZAN ESPACIO EXTRA EN LA MEMORIA.
        mipotato.QuitarBrazo();
        mipotato.QuitarBrazo();
        System.out.println(mipotato.brazo);
    }

}

class Potato{
    public int brazo = 4;

    public void QuitarBrazo(){
        this.brazo--;
    }


}