package org.maincode;

public class Stomach extends Origin {
    private boolean isEmpy;

    public Stomach(String name, String medicalCondition, boolean isEmpy) {
        super(name, medicalCondition);
        this.isEmpy = isEmpy;

    }

    public boolean isEmpy() {
        return isEmpy;
    }

    public void setEmpy(boolean empy) {
        isEmpy = empy;
    }

    @Override
    public void Detalii() {
        super.Detalii();
        if(this.isEmpy()){
            System.out.println("Need to be fed!");}
        else{
            System.out.println("Stomac is full");}

    }
    public void digest(){
        System.out.println("Digesting begin...");
    }

        }


