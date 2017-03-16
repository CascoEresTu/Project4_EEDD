/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

import java.util.ArrayList;
import javax.swing.JTextArea;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author cgcv
 */
public class ThreadAirbotDelivery extends Thread {

    private MultiGraph graph;
    private JTextArea text;
    private Node Selected_EcoStop;
    private Node Selected_Plant;
    private double route_weight;
    private boolean run;

    public ThreadAirbotDelivery(MultiGraph graph, Node Selected_EcoStop) {
        this.graph = graph;
        this.Selected_EcoStop = Selected_EcoStop;
    }

    public ThreadAirbotDelivery(MultiGraph graph, JTextArea text, Node Selected_EcoStop) {
        this.graph = graph;
        this.text = text;
        this.Selected_EcoStop = Selected_EcoStop;
    }

    public MultiGraph getGraph() {
        return graph;
    }

    public void setGraph(MultiGraph graph) {
        this.graph = graph;
    }

    public Node getSelected_EcoStop() {
        return Selected_EcoStop;
    }

    public void setSelected_EcoStop(Node Selected_EcoStop) {
        this.Selected_EcoStop = Selected_EcoStop;
    }

    public double getRoute_weight() {
        return route_weight;
    }

    public void setRoute_weight() {

        this.route_weight = route_weight;
    }

    public boolean isIsAlive() {
        return run;
    }

    public void setIsAlive(boolean isAlive) {
        this.run = isAlive;
    }

    @Override
    public void run() {
        while (run) {
            ArrayList<Double> Weight_Routes;
            Weight_Routes = new ArrayList();
        }

    }


    public Object[] TripRoute_N_Distance(String EcoStop_ID, String PowerPlant_ID) {
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
