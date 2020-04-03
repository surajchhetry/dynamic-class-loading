package com.example;

import com.example.api.DriverManager;
import com.example.api.Shape;

/**
 * User: Surajchhetry
 * Date: 4/3/20
 * Time: 3:41 PM
 */

public class Circle implements Shape {

    static{
        DriverManager.register(new Circle());
    }
    public String getDetail() {
        return "Hi ! from Circle";
    }
}
