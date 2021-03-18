package View;

//Author:Andres Felipe Diaz Silvera
//Date: 09/02/2021

import Triqui.Juego;
import java.util.Scanner;

public class Triqui {

    public static boolean main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int filas = 3, columnas = 3;

        Juego juego01 = new Juego();

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.println(juego01.getTablero()[i][j].getNumero());
            }
        }
        public static void rellenarMatriz(char[][] matriz = new char[0][],char ficha){

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = ficha;
                }
            }
        }

        public static boolean validarPosicion(char[][] tablero, int fila, int columna) {

            if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero.length) {
                return true;
            }
            return false;
        }

        public static boolean hayValorPosicion(char[][] matriz, int fila, int columna, char fichaDef) {
            if (matriz[fila][columna] != fichaDef) {
                return true;
            }
            return false;
        }

        public static void mostrarMatriz(char[][] matriz) {

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }
        }

        public static boolean matrizLlena(char[][] matriz, char fichaDef) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (matriz[i][j] == fichaDef) {
                        return false;
                    }
                }
            }
            return true;
        }
        public static boolean finPartida(char[][] matriz, char ficha) {

            if (matrizLlena(matriz, ficha)
                    || Casilla(matriz, ficha) != ficha
                    || Casilla(matriz, ficha) != ficha
                    || Casilla(matriz, ficha) != ficha) {
                return true;
            }
            return false;
        }

        public static void insertarEn(char[][] matriz, int fila, int columna, char ficha) {
            matriz[fila][columna] = ficha;
        }
    }

    private static boolean matrizLlena(char[][] matriz, char ficha) {
    }







        /*
        1 | 2 | 3
        ---------
        4 | 5 | 6
        ---------
        7 | 8 | 9
*/
    }

}
