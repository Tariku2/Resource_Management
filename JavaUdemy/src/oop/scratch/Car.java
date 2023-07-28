package oop.scratch;

import java.util.Locale;

public class Car {
    private String doors;
    private int wheels;
    private String engine;
    private String model;
    private String colour;
    public  String getModel(){
        return this.model;
    }

    public void setModel(String model) {
        String validModel=model.toLowerCase();
        if(validModel.equals("carrera")||(validModel.equals("comodore"))){
            this.model=model;
        }
        else {
            this.model="Unknown";
        }

    }
}
