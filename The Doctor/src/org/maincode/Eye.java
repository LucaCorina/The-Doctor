package org.maincode;

public class Eye extends Origin {
    private String color;
    private boolean isOpened;

    public Eye(String name, String medicalCondition, String color, boolean isOpened) {

        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void Detalii() {
        super.Detalii();
        System.out.println("Color "+getColor());
    }

    public void open(){
        this.setOpened(true);
        System.out.println(this.getColor()+" Opened");
    }
    public void close(){
        this.setOpened(false);
        System.out.println(this.getColor()+" Closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}

