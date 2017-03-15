/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

import java.util.ArrayList;

/**
 *
 * @author cgcv
 */
public class ProcessingPlant {

    private int plastic_units;
    private int glass_units;
    private int aluminum_units;
    private int burnable_units;
    private char ID;

    private double EnergyProduced;
    
    public ProcessingPlant(int plastic_units, int glass_units, int aluminum_units, int burnable_units, char ID, double EnergyProduced) {
        this.plastic_units = plastic_units;
        this.glass_units = glass_units;
        this.aluminum_units = aluminum_units;
        this.burnable_units = burnable_units;
        this.ID = ID;
        this.EnergyProduced = EnergyProduced;
    }

    public int getPlastic_units() {
        return plastic_units;
    }

    public void setPlastic_units(int plastic_units) {
        this.plastic_units = plastic_units;
    }

    public int getGlass_units() {
        return glass_units;
    }

    public void setGlass_units(int glass_units) {
        this.glass_units = glass_units;
    }

    public int getAluminum_units() {
        return aluminum_units;
    }

    public void setAluminum_units(int aluminum_units) {
        this.aluminum_units = aluminum_units;
    }

    public int getBurnable_units() {
        return burnable_units;
    }

    public void setBurnable_units(int burnable_units) {
        this.burnable_units = burnable_units;
    }

    public char getID() {
        return ID;
    }

    public void setID(char ID) {
        this.ID = ID;
    }

    public double getEnergyProduced() {
        return EnergyProduced;
    }

    public void setEnergyProduced(double EnergyProduced) {
        this.EnergyProduced = EnergyProduced;
    }

    @Override
    public String toString() {
        return "ProcessingPlant{" + "ID=" + ID + ", EnergyProduced=" + EnergyProduced + '}';
    }
    
}
