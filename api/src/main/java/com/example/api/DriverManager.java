package com.example.api;

/**
 * User: Surajchhetry
 * Date: 4/3/20
 * Time: 3:48 PM
 */

public class DriverManager {

    private static Shape shape;

    public static void register(Shape shape){
        DriverManager.shape = shape;
    }

    public static Shape getShape(){
        return DriverManager.shape;
    }

}
