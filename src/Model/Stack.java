package Model;

import java.util.ArrayList;

public class Stack<T> implements IStack<T>{
    private ArrayList<T> myList;

    public Stack() {
        myList = new ArrayList<T>();
    }


    @Override
    public int count() {
        return myList.size();
    }

    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    @Override
    public void push(T value) {
        myList.add(0, value);
    }

    @Override
    public T pull() {
        return myList.remove(0);
    }

    @Override
    public T peek() {
        return myList.get(0);
    }
}
