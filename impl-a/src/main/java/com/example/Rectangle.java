package com.example;

import com.example.api.DriverManager;
import com.example.api.Shape;

/**
 * User: Surajchhetry
 * Date: 4/3/20
 * Time: 3:39 PM
 */

public class Rectangle implements Shape {

    static{
        DriverManager.register(new Rectangle());
    }

    public String getDetail() {
        return "Hi ! from Rectangle";
    }
}
