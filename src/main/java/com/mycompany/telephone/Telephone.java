
package com.mycompany.telephone;
public class Telephone {
    String model;
    String serialNumber;
    String color;
    boolean mytelephone;
    public Telephone(String model, String serialNumber, String color, boolean mytelephone) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
        this.mytelephone = mytelephone;
    }
    @Override //применим только к этому методу
    public String toString() {
        return model+","+serialNumber+","+color+ ","+(mytelephone?"мобильный":"немобильный");
    }   
}
