/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

/**
 *
 * @author cgcv
 */
public class Employee extends Person {

    private String WorkID;
    private String EcoStopID; 

    public Employee(String name, String last_name, int ID, String phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
    }

    public Employee(String WorkID, String name, String last_name, int ID, String phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
        this.WorkID = WorkID;
    }

    public String getEcoStopID() {
        return EcoStopID;
    }

    public void setEcoStopID(String EcoStopID) {
        this.EcoStopID = EcoStopID;
    }
    

    public String getWorkID() {
        return WorkID;
    }

    public void setWorkID(String WorkID) {
        this.WorkID = WorkID;
    }

    @Override
    public String toString() {
        return super.toString()+ "Employee{" + "WorkID=" + WorkID + '}';
    }
    
}
