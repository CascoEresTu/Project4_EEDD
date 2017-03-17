/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

import java.io.Serializable;

/**
 *
 * @author cgcv
 */
public class LinkedList extends ADTList implements Serializable {

    public class Node {

        public Object data;
        public Node next;

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        Node(Object e) {
            data = e;
            next = null;;
        }

    };

    public Node head;

    @Override
    public boolean insert(Object e, int position) {
        if (position < 0 || position > size) {
            return false; // "MISSION FAILED"
        }
        //Se crea el nodo a insertar en la lista.
        Node neo = new Node(e);

        if (head == null) { //en caso de que la lista esté vacia;
            head = neo;
        } else if (position == 0 && head != null) {
            //inserción al principio de la lista.
            neo.setNext(head);
            head = null;
            head = neo;
        } else if (position > 0 && position < Size()) {
            //Incersión enmedio de la lista.
            Node temp = head;
            //Se recorre hasta la posicion a insertar.
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
            //se enlaza el nodo.
            neo.setNext(temp.getNext());
            temp.setNext(neo);
        } else {
            //insercion al final de la lista.
            Node temp = head;
            //se recorre hasta el final.
            for (int i = 1; i < position - 1; ++i) {
                temp = temp.getNext();
            }
            //se enlaza el nodo
            temp.setNext(neo);
        }

        size++;
        return true;
    }

    @Override
    public Object remove(int position) {
        if (position < 0 || position > Size()) {
            return null;
        }

        if (position == 0) {
            Node temp;
            Object retval;

            temp = head.getNext();
            retval = head.getData();
            head.next = null;

            head = temp;
            size--;
            return retval;
        } else if (position == Size() - 1) {
            Node temp;
            Object retval;
            temp = head;

            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }

            Node temp2 = temp.next;
            retval = temp.next.data;
            //        temp->next->data = NULL;
            temp.next = null;
            size--;
            //std::cout << "holis" << '\n';
            return retval;
        } else if (position > 0 && position < Size() - 1) {
            Node temp;
            Object retval;

            temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.next;
            }

            Node temp2 = temp.next.next;
            retval = temp.next.data;
            temp.next = temp.next.next;

            temp.next = null;
            size--;
            return retval;
        }
        return null;
    }

    @Override
    public Object first() {
        if (head == null) {
            return null; // "MISSION FAILED"
        }
        return head.data;
    }

    @Override
    public Object last() {
        if (head != null) {
            Node temp = head;
            //Se recorre hasta llegar al final.
            for (int i = 1; i < Size(); i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        return null;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int indexOf(Object element) {
        Node temp = head;

        for (int i = 0; i < Size(); i++) {
            // Se compara cada uno de los elementos con el parámetro.
            if (element.equals(temp.data)) {
                return i;
            }
            temp = temp.next;
        }
        // En el caso de no encontrarlo
        return -1; // "MISSION FAILED"
    }

    @Override
    public Object get(int position) {
        if (position < 0 || position > Size()) {
            return null; // "MISSION FAILED"
        }

        Node temp = head;
        //Se hace recorrido hasta la posicion deseada.
        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
        }
        return temp.getData(); //"MISSION COMPLETE"    }
    }

    @Override
    public boolean isEmpty() {
        if (head != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int Size() {
        return this.size;
    }

}
