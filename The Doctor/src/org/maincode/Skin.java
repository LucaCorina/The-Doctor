package org.maincode;

public class Skin extends Origin {
    private String color;
    private int sofness;

    public Skin(String name, String medicalCondition, String color, int sofness) {
        super(name, medicalCondition);
        this.color = color;
        this.sofness = sofness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSofness() {
        return sofness;
    }

    public void setSofness(int sofness) {
        this.sofness = sofness;
    }

    @Override
    public void Detalii() {
        super.Detalii();
        System.out.println("Skin Color "+ this.getColor());
    }
}
