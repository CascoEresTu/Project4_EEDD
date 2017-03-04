/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

/**
 *
 * @author k_k_r
 */
public abstract class ADTList {

    protected int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ADTList() {
        this.size = 0;
    }

    public abstract boolean insert(Object o, int i);

    public abstract Object remove(int i);

    public abstract Object first();

    public abstract Object last();

    public abstract void clear();

    public abstract int indexOf(Object o);

    public abstract Object get(int i);

    public abstract boolean isEmpty();

    public abstract boolean isFull();

    public abstract int Size();
}
