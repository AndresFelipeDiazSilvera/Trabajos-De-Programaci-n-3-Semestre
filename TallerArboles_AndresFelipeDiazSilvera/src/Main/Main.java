package Main;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 10/05/2021

import Menu.Archivo;

import javax.swing.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    private Archivo gestor;

    public static void main(String[] args) {

        Main archivos = new Main();
        archivos.gestor = new Archivo();

        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nARCHIVOS\n" +
                        "[1] Disco Local C\n" +
                        "[2] Disco Local D\n" +
                        "[0] Salir\n" +
                        "\n");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                System.err.println("Ingrese un numero entre 0 y 2");
            }
            if (op < 0) {
                System.err.println("Ingrese un Valor Numerico para poder continuar");
            }

            switch (op) {
                case 1: archivos.f_disco_local_c();
                    break;

                case 2: archivos.f_disco_local_d();
                    break;
            }
        } while (op != 0);
    }

    public void f_disco_local_c(){

        Archivo.Node raiz = new Archivo.Node<>("- Archivos de programa");
        raiz.insert("- Riot Games");
        raiz.insert("- Usuarios");
        raiz.insert("- Musica");
        raiz.insert("- Imagenes");

        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nARCHIVOS C\n" +
                        "[1] Mostrar Archivos\n"+
                        "[0] Salir\n");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                System.err.println("Ingrese un numero entre 0 y 1");
            }
            if (op < 0) {
                System.err.println("Ingrese un Valor Numerico para poder continuar");
            }
            switch (op) {
                case 1: System.out.println("\nLas carpetas o archivos Ubicados en C:");
                    raiz.inorder();
                    break;
                case 2:
                    break;
                default:
            }
        } while (op != 0);
    }

    public void f_disco_local_d(){
        Archivo.Node raiz = new Archivo.Node<>("- Varios");
        raiz.insert("- PerfLogs");
        raiz.insert("- Data");
        raiz.insert("- Escritorio");
        raiz.insert("- PyCharm");
        raiz.insert("- OBS");

        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nARCHIVOS D\n" +
                        "[1] Mostrar Archivos\n"+
                        "[0] Salir\n");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                System.err.println("Ingrese un numero entre 0 y 1");
            }
            if (op < 0) {
                System.err.println("Ingrese un Valor Numerico para poder continuar");
            }
            switch (op) {
                case 1: System.out.println("\nLas carpetas o archivos Ubicados en D:");
                    raiz.inorder();
                    break;
                case 2:
                    break;
                default:
            }
        } while (op != 0);
    }
}
