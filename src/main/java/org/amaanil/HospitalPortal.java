package org.amaanil;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalPortal { //sets up context, gets beans
    public static void main(String[] args) {


        Scanner inputScanner = new Scanner(System.in);
        List<Visitors> visitors = new ArrayList<>();

        Scanner inputscanner = new Scanner(System.in);

        System.out.println("Register or report?");
        String userInput = inputscanner.nextLine();

        userInput = userInput.toLowerCase();

        switch (userInput) {
            case "register":

                boolean running = true;
                while (running) {
                    System.out.print("Enter name or 'q' to quit: ");
                    String name = inputScanner.nextLine();
                    if ("q".equalsIgnoreCase(name)) {
                        running = false;
                    } else {
                        Visitors visitor = new Visitors();
                        visitors.add(visitor);

                    }

                }

                break;
            case "report":
                System.out.println("You chose report");
                break;

            default:
                System.out.println("Wrong input");
        }


    }

}

