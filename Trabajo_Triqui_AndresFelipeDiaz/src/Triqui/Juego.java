package Triqui;

public class Juego {
    private Casilla tablero[][];

    public Juego() {

        tablero = new Casilla [3][3];

        int numeros = 1;

        for(int i = 0;i<3;i++)
            for(int j = 0;j<3;j++)
            {
                this.tablero[i][j] = new Casilla(numeros);
                numeros++;
            }
    }

    public Casilla[][] getTablero() {
        return tablero;
    }

    public void setTablero(Casilla[][] tablero) {
        this.tablero = tablero;
    }
}
