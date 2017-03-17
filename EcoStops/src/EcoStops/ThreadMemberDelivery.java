/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTextArea;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author k_k_r
 */
public class ThreadMemberDelivery extends Thread {

    private ArrayList<Member> MemberList;
    private MultiGraph graph;
    private JTextArea text;
    private boolean run = false;

    public ThreadMemberDelivery(ArrayList<Member> MemberList, MultiGraph graph, JTextArea text) {
        this.MemberList = MemberList;
        this.graph = graph;
        this.text = text;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    @Override
    public void run() {
        while (run) {
            //Se seleccionan miembro y EcoStop a interactuar aleatoreamente
            int selected_member = (int) (Math.random() * MemberList.size() - 1);
            int selected_EcoStop = (int) (Math.random() * 24);

            Member temp = (Member) MemberList.get(selected_member);

            int[] retval = ThrashGenerator();
            ((EcoStop) (graph.getNode("" + selected_EcoStop).getAttribute("EcoStop"))).setUnits(retval);

            int plastics = ((EcoStop) (graph.getNode("" + selected_EcoStop).getAttribute("EcoStop"))).getPlastic_units();
            int aluminums = ((EcoStop) (graph.getNode("" + selected_EcoStop).getAttribute("EcoStop"))).getAluminum_units();
            int glasses = ((EcoStop) (graph.getNode("" + selected_EcoStop).getAttribute("EcoStop"))).getGlass_units();
            int burnables = ((EcoStop) (graph.getNode("" + selected_EcoStop).getAttribute("EcoStop"))).getBurnable_units();

            int total = plastics + aluminums + glasses + burnables;
            if (total > 3000 && total < 4000) {
                this.text.setText(this.text.getText() + "\nHoy ha sido un buen dia para la parada " + selected_EcoStop + "");
            }
            // se crean nuevos valores actuales a depositar 
            temp.setActual_units(ThrashGenerator());

            int[] neoValue = new int[4];
            //Se suma al record del Miembro los depositos que ha hecho            
            for (int i = 0; i < neoValue.length; i++) {
                neoValue[i] = temp.getActual_units()[i] + temp.getHistory_units()[i];
            }

            temp.setHistory_units(neoValue);

            //aleatorio para determinar el tiempo en que se dormirá el hilo
            int tiempo = (int) (Math.random() * 1000);

            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                System.out.println("Oops, me salí del hilo de los Miembros");
            }

        }

        // throw new UnsupportedOperationException("Not supported yet.");
    }

    public int[] ThrashGenerator() {
        int plastic_units = (int) (Math.random() * 200) + 50;
        int glass_units = (int) (Math.random() * 100) + 20;
        int aluminum_units = (int) (Math.random() * 80) + 30;
        int burnable_units = (int) (Math.random() * 100) + 10;
        return new int[]{plastic_units, glass_units, aluminum_units, burnable_units};
    }

}
