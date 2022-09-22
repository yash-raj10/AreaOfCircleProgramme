package com.yash;

import java.util.Scanner;

//Area Of Circle Java Program
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("enter the radius");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double Area = Math.PI * radius* radius;
        System.out.println(Area);

    }
}
