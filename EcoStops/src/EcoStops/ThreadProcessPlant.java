/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

import java.util.ArrayList;
import javax.swing.JProgressBar;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author cgcv
 */
public class ThreadProcessPlant extends Thread {

    private MultiGraph graph;
    private JProgressBar work;
    private JProgressBar energy_produced;
    private char ProcPlantID;
    private boolean run = true;

    public ThreadProcessPlant(MultiGraph graph, JProgressBar work, JProgressBar energy_produced, char PowerPlantID) {
        this.graph = graph;
        this.work = work;
        this.energy_produced = energy_produced;
        this.ProcPlantID = PowerPlantID;
    }

    public MultiGraph getGraph() {
        return graph;
    }

    public void setGraph(MultiGraph graph) {
        this.graph = graph;
    }

    public boolean isIsAlive() {
        return run;
    }

    public JProgressBar getWork() {
        return work;
    }

    public void setWork(JProgressBar work) {
        this.work = work;
    }

    public JProgressBar getEnergy_produced() {
        return energy_produced;
    }

    public void setEnergy_produced(JProgressBar energy_produced) {
        this.energy_produced = energy_produced;
    }

    public char getPowerPlantID() {
        return ProcPlantID;
    }

    public void setPowerPlantID(char PowerPlantID) {
        this.ProcPlantID = PowerPlantID;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public void setIsAlive(boolean isAlive) {
        this.run = isAlive;
    }

    @Override
    public void run() {
        String ID = this.ProcPlantID + "";
        System.out.println(ID);
        ProcessingPlant temp = ((ProcessingPlant) (graph.getNode(ID).getAttribute("ProcessingPlant")));
        int sumUnits = temp.getAluminum_units() + temp.getGlass_units() + temp.getAluminum_units();
        if (sumUnits > 0) {
            this.energy_produced.setValue((int) temp.getBurnable_units());
            this.work.setValue(sumUnits);
        }
        while (run) {
            if (this.energy_produced.getValue() >= 0) {
                this.energy_produced.setValue((int) (this.energy_produced.getValue() + (this.work.getValue() * 0.10)));
            }
            if (this.work.getValue() >= 0) {
                this.work.setValue((int) (this.work.getValue() - (this.work.getValue() * 0.05)));
            }
                System.out.println(sumUnits);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("Oops, me salí del hilo de los Miembros");
            }

        }

    }

    public Object[] TripRoute_N_Weight(String EcoStop_ID, String PowerPlant_ID) {
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "Traffic Weight");
        dijkstra.init(graph);
        dijkstra.setSource(graph.getNode(EcoStop_ID));
        dijkstra.compute();
        Object[] retval = new Object[2];

        double weight = 0;
        ArrayList<Node> route = new ArrayList();

        for (Node node : dijkstra.getPathNodes(graph.getNode(PowerPlant_ID))) {
            route.add(node);
        }
        for (Edge edge : dijkstra.getPathEdges(graph.getNode(PowerPlant_ID))) {
            weight += (double) edge.getAttribute("Traffic Weight");
        }
        retval[0] = route;
        retval[1] = weight;
        dijkstra.clear();
        return retval;
    }

}
