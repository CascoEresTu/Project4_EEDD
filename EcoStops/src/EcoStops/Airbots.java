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
public class Airbots {

    private int capacity_plastics ; 
    private int capacity_aluminum;
    private int capacity_glass;
    private int [] materials;
    private boolean isBusy;
    
    public Airbots(int capacity_plastics, int capacity_aluminum, int capacity_glass) {
        this.materials = new int[3];
        this.capacity_plastics = capacity_plastics;
        this.capacity_aluminum = capacity_aluminum;
        this.capacity_glass = capacity_glass;
    }

    public Airbots(int capacity_plastics, int capacity_aluminum, int capacity_glass, int[] materials) {
        this.capacity_plastics = capacity_plastics;
        this.capacity_aluminum = capacity_aluminum;
        this.capacity_glass = capacity_glass;
        this.materials = materials;
        this.isBusy = false;
    }
        

    public Airbots() {
        this.materials = new int[3];
    }

    public int getCapacity_plastics() {
        return capacity_plastics;
    }

    public void setCapacity_plastics(int capacity_plastics) {
        this.capacity_plastics = capacity_plastics;
    }

    public int getCapacity_aluminum() {
        return capacity_aluminum;
    }

    public void setCapacity_aluminum(int capacity_aluminum) {
        this.capacity_aluminum = capacity_aluminum;
    }

    public int getCapacity_glass() {
        return capacity_glass;
    }

    public void setCapacity_glass(int capacity_glass) {
        this.capacity_glass = capacity_glass;
    }
    
}
