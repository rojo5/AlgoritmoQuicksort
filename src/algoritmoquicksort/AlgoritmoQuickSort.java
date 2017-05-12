/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoquicksort;

/**
 *
 * @author rojo5
 */
public class AlgoritmoQuickSort {

    static int[] numeros = {10, 7, 21, 32, 14, 5, 45, 12, 98};
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int der= numeros.length-1;
        int izq=0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        ordenaNumeros(numeros, izq, der);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void ordenaNumeros(int[] arrayNum, int izq, int  der) {
        int _der=der;
        int _izq=izq;
        
        int pivote = arrayNum[izq];
        int aux;

        while(_izq<_der){
            //Recorre el array de izquierda a derecha en busca de un numero menor o igual al pivote
            while(arrayNum[_izq]<=pivote && _izq<_der){
                _izq++;
            }
            //Recorre el array de derecha a izquierda en busca de un numero mayor al pivote
            while(arrayNum[_der]>pivote){
                _der--;
            }
            //intercambia las posiciones de los nummeros
            if(_izq<_der){
                aux= arrayNum[_izq];
                arrayNum[_izq]= arrayNum[_der];
                arrayNum[_der]=aux;
            }
        }
        //Se recoloca el pivote para dejar los menores que el pivote queden a la izquierda y los
        //mayores a la derecha
        arrayNum[izq]=arrayNum[_der];
        arrayNum[_der]=pivote;
        //Se llama asi mismo para ordenar los subarray donde le indicas donde empiezan y acaban
        if(izq<_der-1){
            ordenaNumeros(arrayNum, izq, _der-1);
        }
        if(_der+1<der){
               ordenaNumeros(arrayNum, _der+1, der);
        }
        
    }
}
