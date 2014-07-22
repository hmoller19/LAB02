//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//Héctor Möller 09002
//Ángel Basegoda 13
//Johnny del Cid 13
//Fecha de entrega: julio  22, 2014
//
//Clase: StackVectorTest.java
//Pruebas unitarias de StackVector.java. 
//


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackVectorTest {
    
    public StackVectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of push method, of class StackVector.
     */
    @Test
    public void testPush() {
        // Se guarda dato en el stack.
        // Al retirar un dato, debe ser el mismo que se guardó.
        System.out.println("push");
        String item = "Hola";
        StackVector<String> instance = new StackVector<String>();
        instance.push(item);
        String expResult = instance.pop();
        assertEquals(item, expResult);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackVector.
     */
    @Test
    public void testPop() {
        // Se guarda primero A y luego B en el stack.
        // Luego se retiran los dos datos y se comprueba el "FILO" (First in, last out).
        System.out.println("pop");
        StackVector<String> instance = new StackVector<String>();
        String result1 = "A";
        String result2 = "B";
        instance.push(result1);
        instance.push(result2);
        instance.pop();
        instance.pop();
        String expResult = "A";
        assertEquals(result1, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class StackVector.
     */
    @Test
    public void testPeek() {
        //Introduzco a pila el String "ABC" y compruebo que eso es lo que está al tope de la pila.
        System.out.println("peek");
        StackVector<String> instance = new StackVector<String>();
        String item = "ABC";
        instance.push(item);
        String expResult = "ABC";
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class StackVector.
     */
    @Test
    public void testEmpty() {
        //Se introduce el String "1". Luego se comprueba que no está vacío.
        System.out.println("empty");
        StackVector<String> instance = new StackVector<String>();
        String item = "1";  
        instance.push(item);
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        //Se saca el valor, y luego se vuelve a preguntar si está vacío. 
        instance.pop();
        boolean expResult2 = true;
        boolean result2 = instance.empty();
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackVector.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackVector<String> instance = new StackVector<String>();
        String item1 = "A";
        String item2 = "B";
        instance.push(item1);
        instance.push(item2);
        int expResult = 2;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
