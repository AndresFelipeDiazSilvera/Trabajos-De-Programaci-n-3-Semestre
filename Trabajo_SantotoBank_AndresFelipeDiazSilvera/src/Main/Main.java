package Main;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 25/03/2021


import Controller.Bank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        menu();
    }

    public static void menu() {
        Bank bank = new Bank();
        Scanner keyboard = new Scanner(System.in);
        int opt = -1;
        do {
            try {
                System.out.println("Bienvenido a SantotoBank Seleccione una opción: \n" +
                        "1. ingresar nuevo usuario\n" +
                        "2. Lista de las usuarias (por apellido) y ver detalles\n" +
                        "3. Agregar una nueva cuenta al usuario\n" +
                        "4. agregar o restar dinero a la cuenta\n" +
                        "5. Oprime 0 para salir");
                opt = keyboard.nextInt();
                switch (opt) {
                    case 1 -> {
                        inputUserValues(bank);
                    }
                    case 2 -> {
                        bank.listUser();
                    }
                    case 3 -> {
                        inputValueAccount(bank);
                    }
                    case 4 -> {
                        inputResidueValue(bank);
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("Tipo de valor de entrada int !!");
                keyboard.nextLine();
            }
        } while (opt != 0);
    }

    public static void inputUserValues(Bank bank) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        String name = keyboard.nextLine();
        System.out.println("Ingrese el apellido del usuario");
        String lastName = keyboard.nextLine();
        bank.save(name, lastName);
    }

    public static void inputValueAccount(Bank bank) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("ingrese el id del usuario (para cancelar escriba -1)");
            int id = keyboard.nextInt();
            System.out.println("quieres una cuenta de ahorros (escribe verdadero)\n" +
                    "de lo contrario, escriba falso en una cuenta corriente");
            boolean type = keyboard.nextBoolean();
            bank.updateAccount(id, type);
        } catch (InputMismatchException e) {
            System.err.println("por favor ingrese el valor correcto");
        }
    }

    public static void inputResidueValue(Bank bank) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("ingrese el id del usuario (para cancelar escriba -1)");
            int id = keyboard.nextInt();
            System.out.println("ingrese el id de la cuenta");
            int idA = keyboard.nextInt();
            System.out.println("si desea agregar dinero (escriba verdadero\n" +
                    "De lo contrario, escribe falso para descansar. )");
            boolean changeResidue=keyboard.nextBoolean();
            System.out.println("cuánto dinero quieres cambiar");
            double residue = keyboard.nextDouble();
            bank.addResidue(id, idA, residue,changeResidue);
        } catch (InputMismatchException e) {
            System.err.println("por favor ingrese el valor correcto");
        }
    }
}
