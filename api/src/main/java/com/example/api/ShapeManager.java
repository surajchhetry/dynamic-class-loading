package com.example.api;

/**
 * User: Surajchhetry
 * Date: 4/3/20
 * Time: 3:48 PM
 */

public class ShapeManager {

    private static Shape shape;

    private ShapeManager() {}

    public static synchronized void register(Shape shape){
        if(ShapeManager.shape == null)
            ShapeManager.shape = shape;
    }

    public static Shape getShape(){
        return ShapeManager.shape;
    }

    public static synchronized void unRegister(){
        ShapeManager.shape = null;
    }

}
