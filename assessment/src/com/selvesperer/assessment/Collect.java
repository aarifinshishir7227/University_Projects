package com.selvesperer.assessment;

/**
 *
 * @author Dipok Roy
 */
public class Collect {
    private String name;
    private int age;
    private String address;
    private String number;
    
    public Collect(String name,int age,String address,String number) {
        this.address = address;
        this.age = age;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
    public void show(){
        System.out.println( name + "--> "+age+" --> " + address + "--> "+ number);
    }
    
}
