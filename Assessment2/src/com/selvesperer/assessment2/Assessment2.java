/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selvesperer.assessment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author aarifin
 */
public class Assessment2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(read.readLine());
        List <Person> value = new LinkedList<>();
        Set<String> component = new HashSet<>();
        for(int i=0;i<input;i++) {
            Person person = new Person(null, null);
            System.out.println("Enter name --> ");
            person.setName(read.readLine());
            System.out.println("Enter number --> ");
            String number = read.readLine();
            person.setNumber(number);
            if(component.add(number))
                value.add(person);
            else
                System.out.println("this input number already exists..and number cannot be duplicate .... "+ person.getNumber());    
        }
       
        value.stream().forEach((p) -> {
            p.show();
        });
        Person person = new Person(null, null);
        
        System.out.println("Enter number for search him / her --> ");
        String value1 = read.readLine();
         
        int count =0;
        for (Person value2 : value) {
            person = value2;

                if (person.matches(person.getNumber(), value1)) {
                    int i = value.indexOf(person);
                    
                Collections.swap(value, count, i);
                count++;
            }
        }
        value.stream().forEach((p) -> {
            p.show();
        });
         
    }
    
}
