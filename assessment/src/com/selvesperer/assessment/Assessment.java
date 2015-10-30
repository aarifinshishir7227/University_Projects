/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selvesperer.assessment;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author aarifin_shishir
 */
public class Assessment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("how many input do u want to take --> ");
        int input = scan.nextInt();
        List <Collect> coll = new LinkedList<>();
        Set<String> component = new HashSet<>();
        for(int i=0;i<input;i++){
            System.out.println("please Enter person's detail's --> ");
            Collect collect = new Collect(null,0, null, null); 
            System.out.println("");
            System.out.println("Enter name --> ");
            collect.setName(scan.next());
            System.out.println("Enter age --> ");
            collect.setAge(scan.nextInt());
            System.out.println("Enter address --> ");
            collect.setAddress(scan.next());
            System.out.println("Enter number --> ");
            String number = scan.next();
            collect.setNumber(number);
            if(component.add(number))
                coll.add(collect);
            else
                System.out.println("this input number already exists..and number cannot be duplicate .... "+ collect.getNumber());
            
        }
        /**
         * for showing the total list..
         */
        System.out.println("name --> age --> address --> number");
        coll.stream().forEach((cc) -> {
            cc.show();
        });
        
        Collect collect = new Collect(null,0, null, null); 
        System.out.println("Enter name for search him / her --> ");
         String value = scan.next();
         /**
          * the code is searching 
          */
         System.out.println("name --> age --> address --> number");
        for (Collect coll1 : coll) {
            collect = coll1;
            if (value.equals(collect.getName())) {
                coll1.show();
            }
        }
        /**
         * for updating information..
         */
        System.out.println("");
     //   for (Collect coll1 : coll) {
           // collect = coll1;
           System.out.println("please Enter Number and edit his / her detail's -->");
           String val = scan.next();
           if(!component.add(val))
               component.remove(val);
           else
               component.add(val);
    
           System.out.println("please enter the number which one u want to insert --> ");

            if (value.equals(collect.getName()) ) {
                System.out.println("Enter name -- > ");
                collect.setName(scan.next());
                System.out.println("Enter age -- > ");
                collect.setAge(scan.nextInt());
                System.out.println("Enter address -- > ");
                collect.setAddress(scan.next());
                //System.out.println("Enter number -- > ");
                collect.setNumber(val);
            }
      
        /**
         * after updating the information the representation is ...
         */
        coll.stream().forEach((cc) -> {
            cc.show();
        });
    }
    
}
