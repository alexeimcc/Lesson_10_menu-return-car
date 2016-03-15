package com.javapractice.beginner;

import Subclasses_Cars.ACCobra;
import Superclasses.Car;
import Superclasses.Colours;
import Superclasses.Models;
import com.sun.tools.doclets.internal.toolkit.builders.AnnotationTypeOptionalMemberBuilder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Car Impala = new Car();
        //Impala.crashChance();
        menu();


    }

    public static void menu() {

        Scanner input = new Scanner(System.in);

        //Model choice
        String modelsText = "Please chose a car model:";
        System.out.println(modelsText);
        for (int i = 0; i < modelsText.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
        for (Models n : Models.values()) {
            System.out.println(n);
        }
        System.out.println();

        //Variable used for constructor
        String model = input.next();

        //Color choice
        //String coloursText = "Please chose a colour:";
        //System.out.println(coloursText);
        //for (int i = 0; i < coloursText.length(); i++) {
            //System.out.print("*");
        //}
        //System.out.println();
        //for (Colours n : Colours.values()) {
            //System.out.println(n);
        //}

        //String colour = input.next();

        
    }
}
