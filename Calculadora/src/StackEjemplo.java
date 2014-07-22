//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//Héctor Möller 09002
//Ángel Basegoda 13
//Johnny del Cid 13
//Fecha de entrega: julio  22, 2014
//
//Clase: StackEjemplo.java
//Driver de la pila.  Parte del material del curso.
//

public class StackEjemplo {
public static void main(String[] args) {
    //Stack<String> miStack = new StackArrayList<String>();
    Stack<String> miStack = new StackVector<String>();
    miStack.push("Adios");  //1
	miStack.push("Hola");   //2

    String cadena = miStack.pop();
    System.out.println(cadena);
	cadena = miStack.pop();
	System.out.println(cadena);
        
  }
}
