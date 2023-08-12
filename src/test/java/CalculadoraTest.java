import org.example.Calculadora;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculadoraTest {

    @Test
    public void sumarTest(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.sumar(2,2);
        assertEquals(4,result);
    }
    @Test
    public void restarTest(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.restar(2,2);
        assertEquals(0,result);
    }
    @Test
    public void multiplicarTest(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.multiplicar(3,2);
        assertEquals(6,result);
    }
    @Test
    public void dividirTest(){
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividir(5,2);
        assertEquals(2.5,result);
    }
}
