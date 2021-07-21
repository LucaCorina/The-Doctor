package org.maincode;

public class Origin {
    private  String name;
    private  String medicalCondition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public Origin(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;

    }
    public void Detalii(){
        System.out.println("Name "+ this.getName());
        System.out.println("Medical Condition "+ this.getMedicalCondition());

    }
}
