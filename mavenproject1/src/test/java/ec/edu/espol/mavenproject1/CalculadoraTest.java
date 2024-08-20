/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.mavenproject1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author CltControl
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    //Caso de prueba: 10.0 + 10.2 = 20.//Caso de prueba: 10.0 + 10.2 = 2
    @Test
    public void testSuma() {
        System.out.println("suma");
        double a = 10.0;
        double b = 10.2;
        Calculadora instance = new Calculadora();
        double expResult = 20.2;
        double result = instance.suma(a, b);
        assertEquals(expResult, result);
    }

    // Caso de prueba: 10.5 - 1.5 = 9 
    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 10.5;
        double b = 1.5;
        Calculadora instance = new Calculadora();
        double expResult = 9;
        double result = instance.resta(a, b);
        assertEquals(expResult, result);
    }

    // Caso de prueba: 0*0 = 0
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);
    }
    
    // Caso de prueba: 10/0 ERROR ARREGLAR
    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 10;
        double b = 0;
        Calculadora instance = new Calculadora();

        // Usa assertThrows para verificar que se lance una excepción
        assertThrows(ArithmeticException.class, () -> {
            instance.division(a, b);
        });
    }
    
    // Caso de prueba: 0,0 ERROR ARREGLAR
    @Test
    public void testExponenciacion() {
        System.out.println("exponenciacion");
        double base = 0;
        double exponente = 0;
        Calculadora instance = new Calculadora();

        // Usa assertThrows para verificar que se lance una excepción
        assertThrows(IllegalArgumentException.class, () -> {
            instance.exponenciacion(base, exponente);
        });
    }

    // Caso de prueba: raiz de (-4) = error  ARREGLAR
    @Test
    public void testRadicacion() {
        System.out.println("radicacion");
        double numero = -4;
        double indice = 2;
        Calculadora instance = new Calculadora();
        
        assertThrows(IllegalArgumentException.class, () -> {
        instance.radicacion(numero, indice);
        });
    }
    
    // Caso de prueba: 220 y 284  TRUE
    @Test
    public void testSonAmigos() {
        System.out.println("sonAmigos");
        int a = 220;
        int b = 284;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
    }
    
    // Caso de prueba: 220 = 284
    @Test
    public void testSumaDivisores() {
        System.out.println("sumaDivisores");
        int x = 220;
        Calculadora instance = new Calculadora();
        int expResult = 284;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
}
