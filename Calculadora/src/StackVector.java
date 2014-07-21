/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Math.E;


/**
 *
 * @author Héctor
 */
public class StackVector<E> implements StackInterface<E>{
    
    
    protected Vector <E> stack;
    
    //Constructor
    public StackVector(){
    Vector<E> stack = new Vector<E>(0); 
    }
    
    
    private int stackPointer = 0;
    private boolean empty; 
    
    
    @Override
    public void push(E item) {
        stack.addElement(item);
        stackPointer = stackPointer + 1;
        
    }

    @Override
    public E pop() {
        if(stackPointer>0){
            E ultimo = stack.lastElement();
            stack.removeElementAt(stackPointer);
            return ultimo;
        }
        return null;
                    
    }

    @Override
    public E peek() {
        return stack.lastElement();
    }

    @Override
    public boolean empty() {
        if (getStackPointer()==0)
            stack.isEmpty();
        return empty;
    }

    @Override
    public int size() {
       return getStackPointer();
    }

    /**
     * @return the stackPointer
     */
    public int getStackPointer() {
        return stackPointer;
    }

    /**
     * @param stackPointer the stackPointer to set
     */
    public void setStackPointer(int stackPointer) {
        this.stackPointer = stackPointer;
    }

    /**
     * @return the empty
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * @param empty the empty to set
     */
    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
    
    
}
