/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genarationhistory.model;

/**
 *
 * @author Muhi
 */
public class Person {
    private int id;
    private int parent;
    private String name;
    private String contact;
    private String address;
    
    //create table person (id int GENERATED ALWAYS AS IDENTITY (START WITH 100, INCREMENT BY 1), parent int, name varchar(100), contact varchar(20), address varchar(200));

    public Person(int id, int parent, String name, String contact, String address) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
