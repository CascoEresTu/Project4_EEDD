/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author k_k_r
 */
public class TrafficChangerThread extends Thread {

    MultiGraph graph;
    boolean run = true;

    public TrafficChangerThread(MultiGraph graph) {
        this.graph = new MultiGraph("Map");
        this.graph = graph;
    }

    public MultiGraph getGraph() {
        return graph;
    }

    public void setGraph(MultiGraph graph) {
        this.graph = graph;
    }

    @Override
    public void run() {

        while (run) {

            for (Edge edge : graph.getEachEdge()) {

                int random = (int) (Math.random() * 10000) + 800;
                /*
                En caso de que se ejecute el programa por primera vez
                el atributo en la arista no existiría, por eso entramos 
                en la siguiente condición.
                 */
                if (edge.getAttribute("Traffic Weight") == null) {
                    edge.addAttribute("Traffic Weight", random);
                } else {
                    edge.removeAttribute("Traffic Weight");
                    edge.addAttribute("Traffic Weight", random);
                }
                edge.removeAttribute("ui.label");
                edge.addAttribute("ui.label", "" + edge.getAttribute("Traffic Weight"));
            }
            
            for (Edge edge : graph.getEachEdge()) {
                System.out.println(edge.getAttribute("Traffic Weight") + "");
            }

            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TrafficChangerThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
