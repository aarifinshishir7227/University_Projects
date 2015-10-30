/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selvesperer.assessment2;

/**
 *
 * @author Dipok Roy
 */
public class Person {
    private String name;
    private String number;

    public Person(String name,String number) {
        this.name = name;
        this.number = number;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }
    /**
     * for showing output 
     */
    public void show() {
        System.out.println(name+" ---> "+number);
    }

    /**
     * this code for the string match
     * @param mainString
     * @param subString
     * @return 
     */
    public boolean matches(String mainString, String subString) {
        for(int i=0;i<(mainString.length()-subString.length()+1);i++) {
           String xyz = "";
           for(int j = i;j < subString.length()+i;j++) {
               char c = mainString.charAt(j);
               xyz = xyz + c;
            }
            return xyz.equalsIgnoreCase(subString);
            
        }
        return true;
    }
     
}
