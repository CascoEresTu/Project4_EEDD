/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

/**
 *
 * @author cgcv
 */
public class Employee extends Person {
    //Cada EcoStop tendrá un set de empleados, los cuales se generarán aleatoriamente.
    private String WorkID; // combinación única alfanumérica para cada empleado
    

    public Employee(String name, String last_name, int ID, String phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
    }

    public Employee(String WorkID, String name, String last_name, int ID, String phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
        this.WorkID = WorkID;
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
