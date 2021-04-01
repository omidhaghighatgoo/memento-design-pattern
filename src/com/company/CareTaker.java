package com.company;


import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public Memento getFromMemento(int index){
        return mementoList.get( index);
    }

    public void addToMemento(Memento state){
        mementoList.add(state);
    }




}
