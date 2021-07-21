package org.maincode;

public class Heart extends Origin {
    private int raate;

    public Heart(String name, String medicalCondition, int raate) {
        super(name, medicalCondition);
        this.raate = raate;
    }

    public int getRaate() {
        return raate;
    }

    public void setRaate(int raate) {
        this.raate = raate;
    }

    @Override
    public void Detalii() {
        super.Detalii();
        System.out.println("Heart rate "+ getRaate());
    }
}
