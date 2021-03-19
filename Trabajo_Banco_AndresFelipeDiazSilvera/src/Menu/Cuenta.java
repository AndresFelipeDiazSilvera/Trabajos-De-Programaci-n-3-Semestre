package Menu;

public class Cuenta {

    private int numero;
    private char tipo; //a - c
    private double saldo;
    private static int numCuentas = 0;

    public Cuenta() {
        this.numero = 0;
        this.saldo = 0;
        numCuentas++;
    }

    public Cuenta(char tipo, double saldo) {
        this.tipo = tipo;
        this.saldo = saldo;
        numCuentas++;
        this.numero = numCuentas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

