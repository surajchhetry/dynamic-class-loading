package com.example;

import com.example.api.DriverManager;
import com.example.api.Shape;

/**
 * User: Surajchhetry
 * Date: 4/3/20
 * Time: 3:42 PM
 */

public class App {

    public static void main(String[] arg) throws Exception {
        Class.forName("com.example.Circle");
        Shape c = DriverManager.getShape();
        System.out.println(c.getDetail());
    }
}
