package com.example;

import com.example.api.ShapeManager;
import com.example.api.Shape;

/**
 * User: Surajchhetry
 * Date: 4/3/20
 * Time: 3:42 PM
 */

public class App {

    public static void main(String[] arg) throws Exception {
        Class.forName("com.example.Circle");
        Shape c = ShapeManager.getShape();
        System.out.println(c.getDetail());
    }
}
