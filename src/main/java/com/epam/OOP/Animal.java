package com.epam.OOP;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("This animal is mostly ");
        sb.append(this.color);
        sb.append(". It has ");
        sb.append(this.numberOfPaws);
        sb.append(numberOfPaws>1?" paws and ":" paw and ");
        sb.append(hasFur?"a fur.":"no fur.");
        return sb.toString();
    }

}
