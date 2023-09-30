package com.onurgundogdu.springxml;

import com.onurgundogdu.springxml.controller.PersonController;
import com.onurgundogdu.springxml.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringXmlApplication {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Onur");
        person.setAge(30);

        PersonController controller = new PersonController();
        try {
            controller.savePersonToXml(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
