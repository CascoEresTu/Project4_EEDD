/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cgcv
 */
public class EcoStop {

    private int ID;
    private ArrayList<Employee> Employees = new ArrayList();
    int plastic_units;
    int glass_units;
    int aluminum_units;
    int burnable_units;  // Lo que nos generará energía. 

    public EcoStop() {
    }

    public EcoStop(int ID) {
        this.ID = ID;
        plastic_units = 0;
        glass_units = 0;
        aluminum_units = 0;
        burnable_units = 0;
    }

    public int getPlastic_units() {
        return plastic_units;
    }

    public int getGlass_units() {
        return glass_units;
    }

    public int getAluminum_units() {
        return aluminum_units;
    }

    public int getBurnable_units() {
        return burnable_units;
    }

    
    public void setUnits(int[] units) {
        this.plastic_units += units[0];
        this.glass_units += units[1];
        this.aluminum_units += units[2];
        this.burnable_units += units[3];
    }
    public void emptyEcostop(){
        this.plastic_units = 0;
        this.glass_units = 0;
        this.aluminum_units = 0;
        this.burnable_units = 0;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Employee> getEmployees() {
        return Employees;
    }

    public void addEmployee(Employee e) {
        this.Employees.add(e);
    }

    public void removeEmployee(int index) {
        if (Employees.get(index) != null) {
            Employees.remove(index);
        } else {
            JOptionPane.showMessageDialog(null, "Aqui no hay nada");
        }
    }

    @Override
    public String toString() {
        return ID + "";
    }

}
