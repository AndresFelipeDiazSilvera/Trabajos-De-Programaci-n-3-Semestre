/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import model.Pan;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andres Felipe Diaz Silvera
 * Date:21/02/2021
 */
public class Panaderia {

	private Cliente clientes[] = new Cliente[3];
	private Pan despensa[] = new Pan[5];
	private int clienteactual = 0;
	private Cliente cliente;
	private int ventasDiarias[];
	private int numVentas;
	private int i;


	public Panaderia() {
	}

	public void venderPan(PanController gp) {

		while (clienteactual <= 2) {
			Scanner keyboard = new Scanner(System.in);
			try {
				Pan[] canastaProvisional = new Pan[10];
				int total = 0;

				System.out.println("Tipo de pan a la venta:");
				despensa = gp.ShowPanes();
				for (int i = 0; i < despensa.length; i++) {
					System.out.println(despensa[i].getTipo());
				}

				System.out.println("Cuantos panes desea comprar de cada tipo?:");

				int numCanasta = 0;
				for (int i = 0; i < despensa.length; i++) {
					System.out.println(despensa[i].getTipo());
					int numeroPanes = keyboard.nextInt();

					for (int j = 0; j < numeroPanes; j++) {

						canastaProvisional[numCanasta] = despensa[i];

						numCanasta++;
						total += despensa[i].getPrecio();
					}

				}
				System.out.println("Ingrese el nombre del cliente:");
				String nameString = keyboard.next();
				cliente = new Cliente(nameString, canastaProvisional);
				clientes[clienteactual] = cliente;
				System.out.println(clientes[clienteactual].toString() + "\n" + "Total: " + total);
				clienteactual++;
			} catch (InputMismatchException e) {

				System.err.println("Ingrese valores tipo int");
				keyboard.next();

			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("La canasta esta llena" + "si el programa no continua ingrese cualquiertecla+intro");
				keyboard.next();


				ventasDiarias = new int[100];
				numVentas = 0;

				ventasDiarias[numVentas] += despensa[i].getPrecio();

			}
			numVentas++;
		}
	}
}

