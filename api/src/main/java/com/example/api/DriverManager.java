package com.example.api;

/**
 * User: Surajchhetry
 * Date: 4/3/20
 * Time: 3:48 PM
 */

public class DriverManager {

    private static Shape shape;

    private DriverManager() {}

    public static synchronized void register(Shape shape){
        if(DriverManager.shape == null)
            DriverManager.shape = shape;
    }

    public static Shape getShape(){
        return DriverManager.shape;
    }

}
