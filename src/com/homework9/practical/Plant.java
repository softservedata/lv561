package com.homework9.practical;
/*
 * Create a class Plant, which includes fields int size, Color color and Type type,
 * and constructor where these fields are initialized. Color and type are Enum.
 * Override the method toString( ).
 * Create classes ColorException and TypeException and describe there all possible colors and types of plants.
 * In the method main create an array of five plants. Check to work your exceptions.
 */

import java.lang.reflect.Type;

enum Color  {
    RED, GREEN, YELLOW, BLUE, SILVER, DARK, SKY, BROWN, ORANGE, WHITE
}
enum Type {

}


public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.Color = color;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public getColor() {
        return Color;
    }

    public void setColor() {
        this.Color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", Color=" + Color +
                ", type=" + type +
                '}';
            }
            public static void main(String[] args)throws Exception{

            }
    class ColorException{

    }
    class TypeException{

    }
}

