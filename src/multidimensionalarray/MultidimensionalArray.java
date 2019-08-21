/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensionalarray;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class MultidimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int[][] tabla = {
            {20,10,0,-10,-20},
            {5,15,25,35,45},
            {11,21,31,41,51},
            {70,63,56,49,42}
        };*/
        int[][] tabla = new int [4][5];
        int[] arrayValoresProductos = new int[5];
        for (int inicio = 0; inicio < 5; inicio++) {
            System.out.println("Introduce el valor del producto " + (inicio + 1) + ": ");
            Scanner valor = new Scanner(System.in);
            arrayValoresProductos[inicio] = valor.nextInt();
        }
        for (int filas = 0; filas < 4; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
                System.out.println("Introduce la cantidad vendida del producto " + (columnas + 1) + " del empelado " + (filas + 1) + ": ");
                Scanner vendidoCant = new Scanner(System.in);
                tabla[filas][columnas] = vendidoCant.nextInt() * arrayValoresProductos[columnas];
            }
        }
        System.out.println("##########\tProducto 1\tProducto 2\tProducto 3\tProducto 4\tProducto 5\tTotal");
        for (int columnas = 0; columnas<4; columnas++) {
            System.out.println("Empleado " + (columnas + 1) + "\t" + tabla[columnas][0] + "\t\t" + tabla[columnas][1] + "\t\t" + tabla[columnas][2] + "\t\t" + tabla[columnas][3] + "\t\t" + tabla[columnas][4] + "\t\t" + (tabla[columnas][4] + tabla[columnas][3] + tabla[columnas][2] + tabla[columnas][1] + tabla[columnas][0]));
        }
        String finalString = "Total";
        int finalFinalTotal = 0;
        for (int columnas = 0; columnas<5; columnas++) {
            int total = 0;
            for (int filas = 0; filas<4; filas++) {
                total = total + tabla[filas][columnas];
                finalFinalTotal = finalFinalTotal + tabla[filas][columnas];
            }
            finalString = finalString + "\t\t" + total;
        }
        System.out.println(finalString + "\t\t" + finalFinalTotal);
    }
}
