package com.example;

import com.example.api.DriverManager;
import com.example.api.Shape;

/**
 * User: Surajchhetry
 * Date: 4/3/20
 * Time: 3:39 PM
 */

public class Rectagle implements Shape {

    static{
        DriverManager.register(new Rectagle());
    }

    public String getDetail() {
        return "Hi ! from Rectagle";
    }
}
