package org.amaanil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {
    public static void register() {
        Scanner inputScanner = new Scanner(System.in);
        List<Visitors.Names> visitors = new ArrayList<>();

        Scanner inputscanner = new Scanner(System.in);

        System.out.println("Register or report?");
        String userInput = inputscanner.nextLine();

        userInput = userInput.toLowerCase();

        switch (userInput) {
            case "register" -> {
                boolean running = true;
                while (running) {
                    System.out.print("Enter name or 'q' to quit: ");
                    String name = inputScanner.nextLine();
                    if ("q".equalsIgnoreCase(name)) {
                        running = false;
                    } else {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        String formattedDateTime = LocalDateTime.now().format(formatter);
                        Visitors.Names visitor = new Visitors.Names(name, formattedDateTime);
                        visitors.add(visitor);


                    }

                }
                for (Visitors.Names names:  visitors
                ) {
                    System.out.println(names.getName() + " " + names.getTimestamp());

                }

            }
            case "report" -> {
                System.out.println("You chose report");

            }
            default -> System.out.println("Wrong input");
        }
    }

}
