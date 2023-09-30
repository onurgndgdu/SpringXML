package com.onurgundogdu.springxml.controller;

import com.onurgundogdu.springxml.model.Person;
import com.thoughtworks.xstream.XStream;

import java.io.FileWriter;

public class PersonController {

    public void savePersonToXml(Person person) throws Exception {
        XStream xStream = new XStream();
        String xml = xStream.toXML(person);

        try (FileWriter fileWriter = new FileWriter("person.xml")) {
            fileWriter.write(xml);
        }
    }
}
