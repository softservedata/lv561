package com.homework9.practical;
/*
 * Create a class Plant, which includes fields int size, Color color and Type type,
 * and constructor where these fields are initialized. Color and type are Enum.
 * Override the method toString( ).
 * Create classes ColorException and TypeException and describe there all possible colors and types of plants.
 * In the method main create an array of five plants. Check to work your exceptions.
 */


enum Color  {
    RED, GREEN, YELLOW, BLUE, SILVER, DARK, SKY, BROWN, ORANGE, WHITE
}
enum Type {
    FLOWER, VEGETABLES, FRUIT
}


public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public Plant() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
                ", color=" + color +
                ", type=" + type +
                '}';
    }
    class ColorException extends Exception{
        public ColorException(String smg){
            super(smg);

        }
    }
        class TypeException extends  Exception{
            public TypeException(String smg){
                super(smg);
            }
        }

    public static void main (String[] args) throws ColorException, TypeException {

            Plant p1 = new Plant(1, Color.ORANGE, Type.FLOWER);
            Plant p2 = new Plant(2, Color.BROWN, Type.FRUIT);
            Plant p3 = new Plant(3, Color.GREEN, Type.VEGETABLES);

    }
}


