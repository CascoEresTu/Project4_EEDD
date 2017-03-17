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
   
    private int [] materials_ToDeliver;
    private boolean isBusy;
    
    public Airbots() {
        this.materials_ToDeliver = new int[4];
        this.isBusy = false;
    }

    public int[] getMaterials_ToDeliver() {
        return materials_ToDeliver;
    }

    public void setMaterials_ToDeliver(int[] materials_ToDeliver) {
        this.materials_ToDeliver = materials_ToDeliver;
    }

    public boolean isIsBusy() {
        return isBusy;
    }

    public void setIsBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }

    @Override
    public String toString() {
        return "Airbots{" + "isBusy=" + isBusy + '}';
    }

   
        

    
    
}
