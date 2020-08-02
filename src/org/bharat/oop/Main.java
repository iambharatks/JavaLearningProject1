package org.bharat.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person patient = new Person("Tom" , 25
                , new Eye("Left Eye","Short Sighted" , "Brown" , true)
                , new Eye("Short Sighted","Short Sighted" , "Brown" , true)
                , new Heart("Heart","Normal" , 70)
                , new Stomach("Stomach","PUD",false )
                , new Skin("Skin","Burned","Wheatish",40));


        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose an organ ");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLefteye().getDetails();
                    if(patient.getLefteye().isOpened()){
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1)
                            patient.getLefteye().close();
                        else
                            continue;
                    }
                    else{
                        System.out.println("\t\t1.Open the Eye");
                        if(scanner.nextInt() == 1)
                            patient.getLefteye().open();
                        else
                            continue;
                    }

                    break;

                case 2:
                    patient.getRighteye().getDetails();
                    if(patient.getRighteye().isOpened()){
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1)
                            patient.getRighteye().close();
                        else
                            continue;
                    }
                    else{
                        System.out.println("\t\t1.Open the Eye");
                        if(scanner.nextInt() == 1)
                            patient.getRighteye().open();
                        else
                            continue;
                    }

                    break;


                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1.Change the Heart Rate");
                    if(scanner.nextInt() == 1){
                        System.out.println("Enter the new Heart Rate");
                        int newrate= scanner.nextInt();
                        patient.getHeart().setRate(newrate);
                        System.out.println("Heart Rate changed to: "+ patient.getHeart().getRate());
                    }
                    else{
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt() == 1)
                        patient.getStomach().digest();
                    else
                        continue;
                    break;

                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    break;
            }
        }while(choice > 0 && choice < 6);
    }
}
