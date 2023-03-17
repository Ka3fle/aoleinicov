/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package cuentas;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        operativa_cuenta(cuenta1, 1000); // Aquí se llama a la función operativa_cuenta con la cuenta1 y una cantidad de 1000.
    }

public static void operativa_cuenta(CCuenta cuenta, double cantidad) {
        double saldoActual;

        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }
}