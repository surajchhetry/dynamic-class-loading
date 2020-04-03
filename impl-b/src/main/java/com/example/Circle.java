package com.example;

import com.example.api.ShapeManager;
import com.example.api.Shape;

/**
 * User: Surajchhetry
 * Date: 4/3/20
 * Time: 3:41 PM
 */

public class Circle implements Shape {

    static{
        ShapeManager.register(new Circle());
    }
    public String getDetail() {
        return "Hi ! from Circle";
    }
}
