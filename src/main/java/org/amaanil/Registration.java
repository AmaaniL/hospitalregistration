package org.amaanil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.amaanil.RegisterPatient.register;

public class Registration {

    public void registration() {

            Scanner inputScanner = new Scanner(System.in);
            List<Visitors> visitors = new ArrayList<>();

            Scanner inputscanner = new Scanner(System.in);

            boolean running = true;
            while (running) {
            System.out.println("Register or report?");
            String userInput = inputscanner.nextLine();

            userInput = userInput.toLowerCase();

            switch (userInput) {
                case "register" -> {

                        System.out.print("Enter name or 'q' to quit: ");
                        String name = inputScanner.nextLine();
                        if ("q".equalsIgnoreCase(name)) {
                            running = false;
                        } else {
                            register(inputScanner, visitors, name);


                        }

                    }

                case "report" -> {

                    if (visitors.isEmpty()) {
                        System.out.println("There have been no visitors yet.");
                    } else {
                        for (Visitors names : visitors
                        ) {
                            System.out.println(names.getName()  + ", Dr." + names.getDoctorName() + ", " + names.getTimestamp());
                            running = false;

                        }
                    }

                }
                default -> System.out.println("Wrong input");
            }
            }
        }



}


