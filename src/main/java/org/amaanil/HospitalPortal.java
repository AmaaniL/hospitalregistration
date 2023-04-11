package org.amaanil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HospitalPortal { //sets up context, gets beans
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);


        Registration registration = new Registration();
        registration.registration();



    }


}

