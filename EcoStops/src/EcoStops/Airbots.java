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
   
    private int[] materials_ToDeliver;

    public Airbots(int[] materials) {
        this.materials_ToDeliver = materials;
    }

    public int[] getMaterials_ToDeliver() {
        return materials_ToDeliver;
    }

    public void setMaterials_ToDeliver(int[] materials_ToDeliver) {
        this.materials_ToDeliver = materials_ToDeliver;
    }

    @Override
    public String toString() {
        return "Airbots{" + "materials_ToDeliver=" + materials_ToDeliver + '}';
    }
}
