package org.amaanil;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class HospitalPortal { //sets up context, gets beans
    public static void main(String[] args) {

      /*  try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HospitalPortalConfig.class)) {
            Registration registration = context.getBean(Registration.class);

        }*/

Registration.register();

    }

}

