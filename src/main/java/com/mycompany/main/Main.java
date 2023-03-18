/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Josefa
 */
public class Main {
    public static void main(String[] args) {
        Plan preferencial = new Plan("Preferencial", 15000, 80);
        Plan normal = new Plan("Normal", 7000, 120);
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int clientesNormal = 0;
        int clientesPreferencial = 0;
        int continuar = 1;

        while (continuar == 1) {
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el tipo de plan (1. Preferencial, 2. Normal): ");
            int tipoPlan = scanner.nextInt();
            while (tipoPlan != 1 && tipoPlan != 2) {
                System.out.print("El tipo de plan ingresado no es válido. Ingrese 1 para Preferencial o 2 para Normal: ");
                tipoPlan = scanner.nextInt();
            }

            System.out.print("Ingrese la cantidad de minutos de uso: ");
            int minutos = scanner.nextInt();
            while (minutos < 0) {
                System.out.print("La cantidad de minutos ingresada no es válida. Ingrese una cantidad mayor a cero: ");
                minutos = scanner.nextInt();
            }

            scanner.nextLine(); 

            double total;
            if (tipoPlan == 1) {
                total = preferencial.calcularCostoTotal(minutos);
                clientesPreferencial++;
            } else {
                total = normal.calcularCostoTotal(minutos);
                clientesNormal++;
            }
            Cliente cliente = new Cliente(nombre, tipoPlan, minutos, total);
            clientes.add(cliente);

            System.out.print("¿Desea ingresar otro cliente? (1 para continuar, 0 para salir): ");
            continuar = scanner.nextInt();
            scanner.nextLine(); 
        }

        System.out.println("\nResultados:");
        System.out.println("Cantidad de clientes con plan Preferencial: " + clientesPreferencial);
        System.out.println("Cantidad de clientes con plan Normal: " + clientesNormal);
        System.out.println("\nDetalles de los clientes:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }
    }
}