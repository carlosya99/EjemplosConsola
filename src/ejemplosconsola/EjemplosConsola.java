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
            } 
            else if (listaMaximos[1] <= lista[i]) {//compruebo si el número que estoy leyendo es mayor
                listaMaximos[1] = lista[i]; //pongo en la SEGUNDA posición al nuevo SEGUNDO máximo
            }
        }

        return listaMaximos;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();

        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));

        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));

        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros3)));
    }

}
