package org.amaanil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

    public void registration() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Scanner inputScanner = new Scanner(System.in);
        List<Visitors> visitors = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("Register or report?");
            String userInput = inputScanner.nextLine();

            userInput = userInput.toLowerCase();

            switch (userInput) {

                case "register" -> {

                    System.out.print("Enter name or 'q' to quit: ");
                    String name = inputScanner.nextLine();
                    if ("q".equalsIgnoreCase(name)) {
                        running = false;
                    } else {
                        Visitors visitor = new Visitors(); // Create a new instance for each visitor

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        visitor.setName(name);
                        visitor.setTimestamp(LocalDateTime.now().format(formatter));

                        System.out.println("Choose between doctor Mario or doctor Frankenstein");
                        String doctor = inputScanner.nextLine();

                        if ("Mario".equalsIgnoreCase(doctor)) {
                            visitor.setDoctorName("Mario");
                        } else if ("Frankenstein".equalsIgnoreCase(doctor)) {
                            visitor.setDoctorName("Frankenstein");
                        } else {
                            System.out.println("Wrong input. Type Mario or Frankenstein.");
                            continue;
                        }

                        visitors.add(visitor);
                    }

                }

                case "report" -> {

                    if (visitors.isEmpty()) {
                        System.out.println("There have been no visitors yet.");
                    } else {
                        for (Visitors visitor : visitors) {
                            System.out.println(visitor.getName() + ", Dr." + visitor.getDoctorName() + ", " + visitor.getTimestamp());
                        }
                    }

                }
                default -> System.out.println("Wrong input");
            }
        }
    }
}
