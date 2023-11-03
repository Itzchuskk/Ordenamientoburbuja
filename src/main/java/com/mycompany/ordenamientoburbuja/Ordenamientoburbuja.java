/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoburbuja;

/**
 *
 * @author Emiliano Moreno
 */
 
import java.util.Arrays;

public class Ordenamientoburbuja {
    private final int[] arreglo;

    public Ordenamientoburbuja(int size) {
        arreglo = new int[size];
    }

    public void setElement(int index, int value) {
        arreglo[index] = value;
    }

    public void bubbleSort() {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public static void main(String[] args) {
       
        Ordenamientoburbuja ordenamiento = new Ordenamientoburbuja(10);

        
        ordenamiento.setElement(0, 5);
        ordenamiento.setElement(1, 2);
        ordenamiento.setElement(2, 9);
        ordenamiento.setElement(3, 1);
        ordenamiento.setElement(4, 5);
        ordenamiento.setElement(5, 6);
        ordenamiento.setElement(6, 3);
        ordenamiento.setElement(7, 7);
        ordenamiento.setElement(8, 8);
        ordenamiento.setElement(9, 4);

        
        ordenamiento.bubbleSort();
        System.out.println("Arreglo ordenado usando el método de burbuja: " + Arrays.toString(ordenamiento.getArreglo()));

        
        ordenamiento.setElement(0, 5);
        ordenamiento.setElement(1, 2);
        ordenamiento.setElement(2, 9);
        ordenamiento.setElement(3, 1);
        ordenamiento.setElement(4, 5);
        ordenamiento.setElement(5, 6);
        ordenamiento.setElement(6, 3);
        ordenamiento.setElement(7, 7);
        ordenamiento.setElement(8, 8);
        ordenamiento.setElement(9, 4);

       
        ordenamiento.selectionSort();
        System.out.println("Arreglo ordenado usando el método de selección: " + Arrays.toString(ordenamiento.getArreglo()));
    }
}
