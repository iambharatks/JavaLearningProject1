package org.bharat.oop;

public class Heart extends Organ{
    private int rate;

    public int getRate() {
        return rate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate: "+ this.getRate());
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }
}
