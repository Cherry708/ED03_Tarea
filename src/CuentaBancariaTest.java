//Archivo Java generado mediante Generate -> Test. Seleccionando además los métodos a comprobar

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;



public class CuentaBancariaTest {

    @Rule
    public ExpectedException excepcion = ExpectedException.none();

    CuentaBancaria pruebaTest = new CuentaBancaria("Jorge Izquierdo", "00491500051234567892");

    @Test
    public void ingresarTest() { //Caso de prueba que permite verificar el método "ingresar"
        pruebaTest.ingresar(1);
        Assert.assertEquals(2, pruebaTest.getSaldo(), 0.0);
    }

    @Test
    public void ingresarNegativoTest() throws Exception {
        excepcion.expect(IllegalArgumentException.class);
        excepcion.expectMessage("No es posible realizar la operación. La cantidad a ingresar debe ser un número positivo.");
        pruebaTest.ingresar(-1);
        Assert.assertEquals(1, pruebaTest.getSaldo(), 0.0);
    }

    @Test
    public void retirarTest() { //Caso de prueba que permite verificar el método "retirar"
        pruebaTest.retirar(1);
        Assert.assertEquals(0, pruebaTest.getSaldo(), 0.0);
    }

    @Test
    public void retirarSaldoInsuficienteTest() throws Exception {
        excepcion.expect(IllegalArgumentException.class);
        excepcion.expectMessage("No es posible realizar la operación. El saldo es inferior a la cantidad a retirar.");
        pruebaTest.retirar(2);
        Assert.assertEquals(0, pruebaTest.getSaldo(), 0.0);
    }

    @Test
    public void retirarNegativoTest() throws Exception{
        excepcion.expect(IllegalArgumentException.class);
        excepcion.expectMessage("No es posible realizar la operación. La cantidad a retirar debe ser un número positivo.");
        pruebaTest.retirar(-1);
        Assert.assertEquals(1, pruebaTest.getSaldo(),0.0);
    }
}