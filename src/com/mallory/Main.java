package com.mallory;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;


public class Main {

    public static void main(String[] args) {

        int firstKilo = 3;  // How much is the first Kilometer
        int nextKilo = 2;  // How much are subsequent Kilometers

        int numPass;    // How many Passengers
        int numKilo; // how far are we going
        double totalCost;  // store the calculated cost


        Scanner myTaxi = new Scanner(System.in);
        System.out.println("How many Passengers?: ");   //get the number of passengers

        numPass = Integer.parseInt(myTaxi.nextLine());  //convert the passenger count to an int

        Scanner myKilo = new Scanner(System.in);
        System.out.println("How Many Kilometers are you travelling");  // get the total distance
        numKilo = Integer.parseInt(myKilo.nextLine()); // convert the distance to a string

        totalCost = numKilo - 1;            // get the total distance, but substrace the first K
        totalCost = totalCost * nextKilo;  // work out the cost without the first K
        totalCost = totalCost + firstKilo;  // add the first k

        if (numPass > 4 ) {
            totalCost = totalCost * 1.5;  //if there are 5 or more passengers add 50%
        }


        System.out.println("Fare is = " + totalCost);  //output the answer




    }
}
