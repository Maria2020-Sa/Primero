## **Tipos de Datos:**

````html
PRIMITIVOS
````
- Caracter = 'a' (Representa un solo caracter)
- String = "Hola" (Representa una secuencia de caracteres)
- Números = 1234
- NumeroFloat = 1234.5678
- Booleanos = true o false

````html
COMPLEJOS: se FORMAN a partir de tipos de datos básicos.
````

**Array** Es un conjunto de un mismo tipo de datos simples. Sus elementos son variables o mutables.

- arrayChar = ['a','b','c']
- arrayString = ["hola","adios"]
- arrayNumeros = [0,1,2,3]
- arrayNumeroFloat = [1.1, 4.4, 3.52]

1. [ ] *Los array siempre deben ser del mismo tipo de dato.*
3. [ ] arrayInvalido = ['a', "texto", 9, 3.1]


- También pueden ser doblemente complejos como el array de arrays:

````html
arrayArrays =[
       [1,2,3]
       [4,5,6]
]
````


**Tupla** Es similar al Array, pero sus elementos son Invariable e Inmutables.
tupla=(a,b,c)


**Array asociativo** Son compuestos porque dentro de su array tienen
un elemento que denominamos "clave" asociado a otro elemento que denominamos "valor".
(También se llaman mapas o diccionarios).

````html
array asociativo [
"clave":valor
]

Ejemplo:
arrayCapitalesPais[
"Ucrania":"Kyiv",
"clave":"valor"
]
````

**Objeto** representa un objeto del mundo real.
Tiene PROPIEDADES Y MÉTODOS (algo que puede alterar las propiedades del objeto, 
por ejemplo en un juguete sería el método quitar sombrero, brazo, oreja, etc.
también tiene el método poner sombrero, oreja, brazo)

````html
Juguete:
       Propiedades:
              -Color:marron
              -Forma:patata
       Método:
              -Poner Sombrero
              -Quitar brazo
````


Ejemplo en Java:

````html
class Juguete{
    String Color="marron";
    String Forma="patata";

    ponerSombrero(){}
    quitarBrazo(){}
}
````