package org.maincode;

public class Pacient {
    private String name;
    private int age;
    private  Eye left;
    private Eye right;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Pacient(String name, int age, Eye left, Eye right, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.left = left;
        this.right = right;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getLeft() {
        return left;
    }

    public void setLeft(Eye left) {
        this.left = left;
    }

    public Eye getRight() {
        return right;
    }

    public void setRight(Eye right) {
        this.right = right;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
