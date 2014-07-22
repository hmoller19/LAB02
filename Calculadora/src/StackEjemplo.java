


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 */
public class StackEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> miStack = new StackVector<String>();
        miStack.push("Adios");  //1
            miStack.push("Hola");   //2

        String cadena = miStack.pop();
        System.out.println(cadena);
            cadena = miStack.pop();
            System.out.println(cadena);
    }
    
}
