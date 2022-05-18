package com.company.main;

public class Task1 {
    public static void main(String[] args){
        for(Shapes S: Shapes.values())
            System.out.println(S + "\t" + "is shape " + S.ordinal());
    }
}
 enum Shapes {
    SQUARE, RECTANGLE, CIRCLE, TRAPEZIUM, RHOMBUS, TRIANGLE, OVAL, HEXAGON;
 }