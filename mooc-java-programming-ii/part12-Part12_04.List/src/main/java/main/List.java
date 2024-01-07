/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author filip
 */
public class List<Type> {

    private Type[] values;
    private int capacity;
    private int length;

    public List() {
        this.capacity = 10;
        this.length = 0;
        this.values = (Type[]) new Object[capacity];
    }

    public void add(Type value) {

        if (this.capacity <= this.length) {
            grow();
        }
        this.values[this.length] = value;
        this.length++;
    }

    public boolean contains(Type value) {
        return this.indexOfValue(value) >= 0;
    }

    public int size() {
        return this.length;
    }

    private void grow() {
        this.capacity = this.capacity + (this.capacity / 2);
        Type[] temp = (Type[]) new Object[this.capacity];
        for (int i = 0; i < this.length; i++) {
            temp[i] = values[i];
        }
        this.values = temp;
    }

    public int indexOfValue(Type value) {
        for (int i = 0; i < this.length; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void shrink(int from) {
        for (int i = from; i < this.length - 1; i++) {

            values[i] = values[i+1];
        }
    }
    public void remove(Type v) {
        int index = indexOfValue(v);
        if(index < 0) {
            return;
        }
        shrink(index);
        this.length--;
    }
    public Type value(int index) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.length + "]");
        }

        return this.values[index];
    }

}
