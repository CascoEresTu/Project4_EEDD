/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cgcv
 */
public class RunThrough implements Runnable {
    double distancia;
    double velocidad;
    boolean vive = false;
    double tiempo;
    public RunThrough(
            double velocidad,
            ArrayList<EcoStop> EcoStops_on_route) {
        this.velocidad = velocidad;
        this.tiempo = distancia / velocidad;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        double temp = tiempo * 2;

        while (vive && temp >= 0) {
            System.out.println(temp);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            temp--;
        }
    }

}
