package org.amaanil;

import java.util.Scanner;


public class Registration {
    static void register(){
        Scanner inputscanner = new Scanner(System.in);

        System.out.println("Register or report?");
        String userInput = inputscanner.nextLine();
        userInput= userInput.toLowerCase();

        switch (userInput){
            case "register":
                System.out.println("You chose register");
                break;
            case "report":
                System.out.println("You chose report");
                break;

            default:
                System.out.println("Wrong input");
        }

    }



}

// TODO: 31/03/2023  if else register report
// TODO: 31/03/2023 register enter name, lastname
// TODO: 31/03/2023 if register one of two doctors or visit
// TODO: 31/03/2023 add timestamp
// TODO: 31/03/2023 report; list who why when