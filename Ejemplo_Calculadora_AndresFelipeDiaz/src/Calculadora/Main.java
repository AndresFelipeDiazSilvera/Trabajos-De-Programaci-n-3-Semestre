package Calculadora;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 15/02/2021

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {

    public static long[] resultados;

    public static void main (String[] args){

        int op=0, n1=0, n2=0;
        String ax;
        operaciones trin = new operaciones();

        do{
            op = JOptionPane.showConfirmDialog(null,"Desea ingresar dos numeros y mostrar el resultado "
                    + "de las 4 operaciones basicas?");
            if(op == JOptionPane.YES_OPTION){
                ax = JOptionPane.showInputDialog(null, "Digite el primer numero: ");
                if(trin.isNum(ax)){
                    n1 = Integer.parseInt(ax);
                    ax = JOptionPane.showInputDialog(null, "Digite el segundo numero: ");

                    if(trin.isNum(ax)){
                        n2 = Integer.parseInt(ax);
                        JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+trin.suma(n1, n2)
                                +"El resultado de la resta es: "+trin.resta(n1, n2)
                                +"El resultado de la multiplicacion es: "+trin.multiplicacion(n1, n2)
                                +"El resultado de la division es: "+trin.division(n1, n2));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese un numero","Advertencia !!!", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Ingrese un numero","Advertencia !!!", JOptionPane.WARNING_MESSAGE);
                }
            }

            else if(op == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Si desea terminar la aplicacion elige Cancelar.","Advertencia !!!" ,JOptionPane.WARNING_MESSAGE);
            }//finaliza bloque

        }while(op!= JOptionPane.CANCEL_OPTION);

        System.exit(0);

        try{
            String ruta = "C:\\resultados.txt";
            java.io.File file = new java.io.File(ruta);

            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Arrays.toString(resultados));
            bw.close();

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}