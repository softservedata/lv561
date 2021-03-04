package com.homework9.practical;
/*
 * Create a class Plant, which includes fields int size, Color color and Type type,
 * and constructor where these fields are initialized. Color and type are Enum.
 * Override the method toString( ).
 * Create classes ColorException and TypeException and describe there all possible colors and types of plants.
 * In the method main create an array of five plants. Check to work your exceptions.
 */



//enum Color  {
  //  RED, GREEN, YELLOW, BLUE, SILVER, DARK, SKY, BROWN, ORANGE, WHITE
//}
//enum Type {

//}


public class Plant {
    private int size;
    private String color;
    private String type;

    public Plant(int size, String color, String type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args)throws Exception{

            }
    class ColorException{

    }
    class TypeException{

    }
}

