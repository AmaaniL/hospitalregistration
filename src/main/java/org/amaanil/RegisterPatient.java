package org.amaanil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class RegisterPatient {
    static void register(Scanner inputScanner, List<Visitors> visitors, String name) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = LocalDateTime.now().format(formatter);
        String doctorName = "doctor";
        Visitors visitor = new Visitors(name, formattedDateTime, doctorName);
        visitors.add(visitor);

        System.out.println("Choose between doctor Mario or doctor Frankenstein");
        String doctor = inputScanner.nextLine();

        if (("Mario".equalsIgnoreCase(doctor))) {
            visitor.setDoctorName("Mario");

        } else if ("Frankenstein".equalsIgnoreCase(doctor)) {
            visitor.setDoctorName("Frankenstein");
        } else {
            System.out.println("Wrong input. Type Mario or Frankenstein.");
        }
    }
}
