package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String name=scanner.nextLine();

        String[] fullName=name.split(" ");

        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String userDate=scanner.nextLine();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate rezDate= LocalDate.parse(userDate, formatter);



        System.out.println("How many tickets would you like?");
        int tickets=scanner.nextInt();

        if(tickets>1) {
            System.out.println(tickets+" tickets reserved for "+rezDate+" under "+fullName[1]+", "+fullName[0]);
        }
        else {
            System.out.println(tickets+" ticket reserved for "+rezDate+" under "+fullName[1]+", "+fullName[0]);
        }




    }
}
