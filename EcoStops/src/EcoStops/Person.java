/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

import java.io.Serializable;

/**
 *
 * @author cgcv
 */
public class Person implements Serializable {
    private String name;
    private String last_name;
    private int ID;
    private String phone;
    private int age;
    private boolean gender;

    public Person(String name, String last_name, int ID, String phone, int age, boolean gender) {
        this.name = name;
        this.last_name = last_name;
        this.ID = ID;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", last_name=" + last_name + ", ID=" + ID + ", phone=" + phone + ", age=" + age + ", gender=" + gender + '}';
    }
     
}
