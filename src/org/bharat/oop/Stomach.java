package org.bharat.oop;

public class Stomach extends Organ{
    private boolean isEmpty;

    public void digest(){
        System.out.println("Digesting Begins...");
    }
    @Override
    public void getDetails() {
        super.getDetails();
        if(!this.isEmpty()){
            System.out.println("Need to be Fed");
        }
        else{
            System.out.println("Stomach is full");
        }
    }

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}