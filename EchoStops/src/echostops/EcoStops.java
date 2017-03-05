/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

import java.util.Iterator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author cgcv
 */
public class EcoStops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Probando la implementación del LinkedList en Java
        /*LinkedList lista = new LinkedList();

        lista.insert(new Person("", "", 1, 0, 0, true), 0);
        lista.insert(new Person("", "", 2, 0, 0, false), 0);
        lista.insert(new Person("", "", 3, 0, 0, true), 0);
        lista.insert(new Person("", "", 4, 0, 0, false), 0);
        lista.insert(new Person("", "", 5, 0, 0, true), 0);
                
        for (int i = 0; i < lista.Size(); i++) {
            System.out.println(lista.get(i).toString());
        }        
   */   new EcoStops();
        
    }
        public EcoStops() {
        Graph graph = new SingleGraph("tutorial 1");

        graph.addAttribute("ui.stylesheet", styleSheet);
        graph.setAutoCreate(true);
        graph.setStrict(false);
        
        graph.display();

        graph.addEdge("AB", "A", "B").addAttribute("Distance", 10);
        graph.addEdge("AC", "A", "C").addAttribute("Distance", 20);
        graph.addEdge("BD", "B", "D").addAttribute("Distance", 30);
        graph.addEdge("CF", "C", "F").addAttribute("Distance", 30);
        graph.addEdge("DF", "D", "F").addAttribute("Distance", 80);
        graph.addEdge("FH", "F", "H").addAttribute("Distance", 10);
        graph.addEdge("HG", "H", "G").addAttribute("Distance", 50);
        graph.addEdge("HZ", "H", "Z").addAttribute("Distance", 45);
        graph.addEdge("PZ", "P", "Z").addAttribute("Distance", 45);
        graph.addEdge("DQ", "D", "Q").addAttribute("Distance", 50);
        graph.addEdge("CQ", "C", "Q").addAttribute("Distance", 10);


        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }

        explore(graph.getNode("A"));
    }

    public void explore(Node source) {
        Iterator<? extends Node> k = source.getBreadthFirstIterator();

        while (k.hasNext()) {
            Node next = k.next();
            next.setAttribute("ui.class", "marked");
            sleep();
        }
    }

    protected void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
    
    protected String styleSheet
            = "node {"
            + "	fill-color: black;"
            + "}"
            + "node.marked {"
            + "	fill-color: blue;"
            + "}";
}
        
        
        


