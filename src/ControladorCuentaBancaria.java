/**
 * @author Cristian Jorge García Marcos
 * @version 11.20
 */

public class ControladorCuentaBancaria {

    public static void main(String[] args) {

        // crea
        CuentaBancaria prueba = new CuentaBancaria("Jorge Izquierdo", "00491500051234567892");

        try {
            prueba.ingresar(10000);
        } catch (Exception e) {
            System.err.print(e.getMessage());
            System.out.println("Error en el método ingresar. ");
        }

        try {
            prueba.retirar(1500);
        } catch (Exception e) {
            System.err.print(e.getMessage());
            System.out.println("Error en el método retirar. ");
        }

        System.out.println(prueba.toString());
    }

}