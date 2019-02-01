/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author Carlos Zea
 */
public class EjemplosConsola {

    //declaro u a array de ints de instancia
    int[] listaNumeros = {200, 31, 27, 2, 5, 99};
    int[] listaNumeros2 = {20, 310, 27, 2, 500, 99};
    int[] listaNumeros3 = {20, 31, 27, 2, 50, 990};

    /*
    el metodo maximos va aclacular el máximo y el segndo máximo de una lista de números
     */
    private int[] maximos(int[] lista) {
        //declaramos un array de dos elementos para guardar el máximo y el segundo máximo
        int[] listaMaximos = {lista[0], lista[1]};

        for (int i = 0; i < lista.length; i++) {
            if (listaMaximos[0] <= lista[i]) {
                if (i != 0) { //desplazo sólo a la derecha si no estoy justo en la primera posición
                    listaMaximos[1] = listaMaximos[0]; //desplazo a la derecha el que había como maximo
                }
                listaMaximos[0] = lista[i];
            } else if (listaMaximos[1] <= lista[i]) {//compruebo si el número que estoy leyendo es mayor
                listaMaximos[1] = lista[i]; //pongo en la SEGUNDA posición al nuevo SEGUNDO máximo
            }
        }

        return listaMaximos;
    }

    private boolean palindromo(String cadena) {
        //primera fase: creo un nuevo String que sea una copia del
        //que me pasan pero quitandole los espacios en blanco
        String auxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != cadena.charAt(0)) {
                auxiliar = auxiliar + cadena.charAt(i);
            }

        }
        //ahora en auxliar tengo el string pero sin espacios en blanco
        //declaro dos indices para que digan qué posiciones estoy comparando
        int indiceIzq = 0;
        int indiceDer = auxiliar.length() - 1;

        //mientras sean iguales los caracteres en esas posiciones la palabra será un palindromo
        //además, si el indice izquierdo es mayor que el derecho, ya he chequeado toda la frase
        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer) {
            indiceIzq++;
            indiceDer--;
        }
        boolean resultado = false;
        if (indiceIzq < indiceDer) {// si esto se cumple es que la palabra no es un palindromo
            resultado = true;
        }

        return true;
    }

    private void palindromoV2(String cadena) {
        String auxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        //aqui ya tengo en el string auxiliar todas las letras
        //de la palabra original pero sin espacios en blanco

        int indiceIzq = 0;
        int indiceDer = auxiliar.length() - 1;

        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && (indiceIzq <= indiceDer)) {
            indiceIzq++;
            indiceDer--;
        }
        boolean resultado = true;
        if (indiceIzq < indiceDer) {
            System.out.print("La cadena " + cadena + "NO es un Palíndromo");
        } else {
            System.out.print("La cadena " + cadena + "SI es un Palíndromo");
        }
    }

    private boolean esIsograma(String palabra) {
        for (int i = 0; i < palabra.length() - 1; i++) {
            for (int j = i + 1; j < palabra.length(); j++) {
                if (palabra.charAt(j) == palabra.charAt(i)) {
                    return false;
                }
            }
        }
        //si ha recorrido los dos bucles for enteros, es que 
        //la palabra no tiene letras repetidas
        return true;
    }

    private void imprimeMes(int num) {

        for (int i = 1; i <= 31; i++) {

            if (i < 10) {
                System.out.print(" " + 0 + i);
            }
            if (i >= 10) {
                System.out.print(" " + i);
            }
            if (i % 7 == 0) {
                System.out.println(" ");
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ramon = new EjemplosConsola();
        EjemplosConsola ejercicios = new EjemplosConsola();

//        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros)) );
//        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros2)) );  
//        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros3)) ); 
//        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros4)) );
//        
//        ramon.palindromo("ACASO HUBO BUHOS ACA") ;
//        ramon.palindromo("ACdfgfgddfgASO HUBO BUHOS ACA") ;
//        ramon.palindromo("TACOCAT") ;
//        ramon.palindromo("TACCAT") ;
//      ramon.palindromoV2("ACASO HUBO BUHOS ACA") ;
//      ramon.palindromoV2("ACdfgfgddfgASO HUBO BUHOS ACA") ;
//      ramon.palindromoV2("TACOCAT") ;
//      ramon.palindromoV2("TACCAT") ;
//      ejercicios.palindromoV2("ACASO HUBO BUHOS ACA") ;
//      ejercicios.palindromoV2("ACdfgfgddfgASO HUBO BUHOS ACA") ;
//      ejercicios.palindromoV2("TACOCAT") ;
//      ejercicios.palindromoV2("TACCAT") ;
        //System.out.println("TACCAT  " + ejercicios.esIsograma("TACCAT"));
        //System.out.println("murcielago  " + ejercicios.esIsograma("murcielago"));
        //System.out.println("murcielagoo  " + ejercicios.esIsograma("murcielagoo"));
        for (int i = 0; i < 7; i++) {
            ejercicios.imprimeMes(i);
            System.out.println();
            System.out.println();
        }
    }

}
