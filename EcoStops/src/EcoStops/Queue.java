/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

/**
 *
 * @author cgcv
 */
public class Queue {
    private LinkedList principal;

    public Queue() {
        this.principal = new LinkedList();
    }
    
    public void Queue(Object o){
        principal.insert(o, 0);
    }
    
    public Object Dequeue(){
       return principal.remove(principal.Size());
    }
    
    public int Size(){
        return principal.Size();
    }
    
}
