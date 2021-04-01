package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("-----------------Memento Design Pattern---------------------");


        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();


        originator.setState("1st State");
        careTaker.addToMemento(originator.storeStateToMemento());

        originator.setState("2nd State");
        originator.setState("3rd State");

        careTaker.addToMemento(originator.storeStateToMemento());


        originator.setState("Final State");
        System.out.println("Current State is : "+ originator.getState());



        originator.restoreStateFromMemento(careTaker.getFromMemento(0));
        System.out.println("1st Saved State is :" + originator.getState());

        originator.restoreStateFromMemento(careTaker.getFromMemento(1));
        System.out.println("2nd Saved State is :" + originator.getState());






    }
}
