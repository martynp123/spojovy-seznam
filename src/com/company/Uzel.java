package com.company;

public class Uzel {
    private int hodnota;
    private Uzel Previous;
    private Uzel Next;

    public Uzel(Integer hodnota) {this.hodnota = hodnota;}

    public int getHodnota() {
        return hodnota;
    }

    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
    }

    public Uzel getPrevious() {
        return Previous;
    }

    public void setPrevious(Uzel previous) {
        this.Previous = previous;
    }

    public Uzel getNext() {
        return Next;
    }

    public void setNext(Uzel next) {
        this.Next = next;
    }
}
