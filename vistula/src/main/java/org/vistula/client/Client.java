package org.vistula.client;

public class Client {

    private String name;
    private int age;
    private int height;
    private int weight;
    private boolean isWoman;

    Client(String name, int age, int height, int weight, boolean isWoman) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isWoman = isWoman;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    public void setIsWoman(boolean isWoman) {
        this.isWoman = isWoman;
    }

    public boolean getIsWoman() {
        if (isWoman == true) {
            System.out.println("Jestem kobieta");

        }
        else {
            System.out.println("Jestem mezczyzna");
        }
        return isWoman;
    }

    public boolean isShort() {
        if (height < 150) {
            return true;
        }
        else {
            return false;
        }
    }
}
