/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

/**
 *
 * @author cgcv
 */
public class EcoStops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Probando la implementación del LinkedList en Java
        LinkedList lista = new LinkedList();

        lista.insert(new Person("", "", 1, 0, 0, true), 0);
        lista.insert(new Person("", "", 2, 0, 0, false), 0);
        lista.insert(new Person("", "", 3, 0, 0, true), 0);
        lista.insert(new Person("", "", 4, 0, 0, false), 0);
        lista.insert(new Person("", "", 5, 0, 0, true), 0);
                
        for (int i = 0; i < lista.Size()-1; i++) {
            System.out.println(lista.get(i).toString());
        }
        lista.remove(lista.Size());

    }

}
