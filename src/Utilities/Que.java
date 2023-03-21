package Utilities;

import java.util.Vector;

public class Que<E> {
    Vector<E> Que;

    public Que(int capacity) {
        Que = new Vector<>(capacity);
    }

    public E pop() {
        return Que.remove(Que.size()-1);
    }

    public boolean push(E e) {
        Que.add(0, e);
        return true;
    }

    public int size() {
        return Que.size();
    }

    public E first() {
        return Que.get(Que.size() - 1);
    }

    public E last() {
        return Que.get(0);
    }

    public boolean isEmpty() {
        return Que.isEmpty();
    }

    public void clear() {
        Que.clear();
    }
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < Que.size(); i++) {
            stringBuilder.append(Que.get(i).toString()+"\n");
        }
        return stringBuilder.toString();
    }
}