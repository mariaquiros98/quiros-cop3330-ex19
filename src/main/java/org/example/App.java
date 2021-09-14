/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.*;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        double weight;
        double height;
        double bmi;

        /*Prompting for weight in inches*/
        System.out.println("Enter weight:");
        weight = scan.nextDouble();

        /*Prompting for weight in pounds*/
        System.out.println("Enter height:");
        height = scan.nextDouble();

        /*Formula to calculate bmi*/
        bmi = (weight / (height * height)) * 703;

        /*Displaying whether a person is within the range of a healthy bmi or not*/
        if (bmi > 18.5 && bmi < 25) {
            System.out.println("You are within the ideal weight range.");
        } else {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}





