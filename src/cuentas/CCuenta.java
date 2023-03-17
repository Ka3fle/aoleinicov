package cuentas;

public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public double obtenerSaldo() {
        return this.saldo;
    }

    public String obtenerCuenta() {
        return this.cuenta;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa o cero");
        }
        if (this.saldo < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        this.saldo -= cantidad;
    }

    public double obtenerTipoInteres() {
        return this.tipoInteres;
    }

    public void asignarTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double estado() {
        return this.saldo;
    }

public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
    double saldoActual;

    try {
        cuenta1.retirar(2300);
    } catch (Exception e) {
        System.out.print("Fallo al retirar");
    }
    try {
        System.out.println("Ingreso en cuenta");
        cuenta1.ingresar(cantidad);
    } catch (Exception e) {
        System.out.print("Fallo al ingresar");
    }
    saldoActual = cuenta1.estado();
    System.out.println("El saldo actual es" + saldoActual);
}
}
