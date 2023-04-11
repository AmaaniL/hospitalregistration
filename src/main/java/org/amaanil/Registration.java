package org.amaanil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

    public void registration() {
        {
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
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                            String formattedDateTime = LocalDateTime.now().format(formatter);
                            Visitors visitor = new Visitors(name, formattedDateTime);
                            visitors.add(visitor);

                            System.out.println("Choose between doctor Mario or doctor Frankenstein");
                            String doctor = inputScanner.nextLine();

                            if (("Mario".equalsIgnoreCase(doctor))) {
                                System.out.println("Mario");
                            } else if ("Frankenstein".equalsIgnoreCase(doctor)) {
                                System.out.println("Frankenstein");
                            } else {
                                System.out.println("Wrong input. Type Mario or Frankenstein.");
                            }


                        }

                    }



                case "report" -> {

                    if (visitors.isEmpty()) {
                        System.out.println("There have been no visitors yet.");
                    } else {
                        for (Visitors names : visitors
                        ) {
                            System.out.println(names.getName() + " " + names.getTimestamp());
                            running = false;

                        }
                    }

                }
                default -> System.out.println("Wrong input");
            }
            }
        }

    }

}
