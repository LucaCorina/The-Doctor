package org.maincode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Pacient pacient=new Pacient("Corina",32,
        new Eye("Left Eye", "Normal","Blue",true),
                new Eye("Right Eye", "Anormal","Red",false),
                new Heart("Heart","Normal",32),
                new Stomach("Stomach","PUD",true),
                new Skin("Skin","Burned","White",34));
        System.out.println("Name "+pacient.getName());
        System.out.println("Age "+pacient.getAge());

        Scanner scanner=new Scanner(System.in);

        boolean shouldFinish =false;

        while(!shouldFinish){
            System.out.println("Choose an Organ "+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                pacient.getLeft().Detalii();
                if(pacient.getLeft().isOpened()) {
                    System.out.println("\t\t1. Close the eye");
                    if (scanner.nextInt() == 1) {
                        pacient.getLeft().close();

                    } else {
                        continue;
                    }
                }else{
                    System.out.println("\t\t1 Open the Eye");
                    if (scanner.nextInt() == 1) {
                        pacient.getLeft().open();

                    } else {
                        continue;
                    }
                }
                break;
                case 2:
                    pacient.getRight().Detalii();
                    if(pacient.getRight().isOpened()) {
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt() == 1) {
                            pacient.getRight().close();

                        } else {
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1 Open the Eye");
                        if (scanner.nextInt() == 1) {
                            pacient.getRight().open();

                        } else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    pacient.getHeart().Detalii();
                    System.out.println("\t\t1 Change the rate");
                    if (scanner.nextInt()==1) {
                        System.out.println("Enter the new Heart rate ");
                        int newH = scanner.nextInt();
                        pacient.getHeart().setRaate(newH);
                        System.out.println("Heart rate changed to "+pacient.getHeart().getRaate());
                    }else{continue;}
                    break;
                case 4:
                    pacient.getStomach().Detalii();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt()==1){
                        pacient.getStomach().digest();}
                    else {continue; }

                case 5:
                    pacient.getSkin().Detalii();
                    break;
                default:
                    shouldFinish=true;
                    break;
            }
        }
    }
}
