package Calculadora;

public class operaciones {

    public int suma(int n1, int n2){
        int op;
        op = n1 + n2;
        return op;
    }

    public int resta (int n1, int n2){
        int op;
        op = n1 - n2;
        return op;
    }

    public int multiplicacion(int n1, int n2){
        int op;
        op = n1 * n2;
        return op;
    }

    public int division(int n1, int n2){
        int op;
        op = n1 / n2;
        return op;
    }

    public boolean isNum(String n){
        int a;
        try{
            a = Integer.parseInt(n);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }

}