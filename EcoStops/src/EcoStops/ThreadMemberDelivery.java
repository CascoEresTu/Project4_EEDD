/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author k_k_r
 */
public class ThreadMemberDelivery implements Runnable {

    private LinkedList MemberList;
    private LinkedList EcoStopList;
    private MultiGraph graph;
    private boolean run = false;

    public ThreadMemberDelivery(LinkedList MemberList, LinkedList EcoStopList) {
        this.MemberList = MemberList;
        this.EcoStopList = EcoStopList;
    }

    public ThreadMemberDelivery(MultiGraph graph, LinkedList MemberList) {
        this.MemberList = MemberList;
        this.graph = graph;
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
            int selected_member = (int) (Math.random() * MemberList.Size() - 1);
            //int selected_EcoStop = (int) (Math.random() * EcoStopList.Size() - 1);
            int selected_EcoStop = (int) (Math.random() * graph.getNodeCount() - 1);
            
            Member temp = (Member) MemberList.get(selected_member);
            EcoStop aux = (EcoStop) EcoStopList.get(selected_EcoStop);
            
            int [] retval = ThrashGenerator();
            ((EcoStop)(graph.getNode(""+selected_EcoStop).getAttribute("EcoStop"))).setUnits(retval);
            
            
         
            // se crean nuevos valores actuales a depositar 
            temp.setActual_units(ThrashGenerator());

            int[] neoValue = new int[4];

            //Se suma al record del Miembro los depositos que ha hecho            
            for (int i = 0; i < neoValue.length; i++) {
                neoValue[i] = temp.getActual_units()[i] + temp.getHistory_units()[i];
            }

            temp.setHistory_units(neoValue);

            //aleatorio para determinar el tiempo en que se dormirá el hilo
            int tiempo = (int) (Math.random() * 1000) + 300;

            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                System.out.println("Oops, me salí del hilo de los Miembros");
            }

        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int[] ThrashGenerator() {
        int plastic_units = (int) (Math.random() * 200) + 50;
        int glass_units = (int) (Math.random() * 100) + 20;
        int aluminum_units = (int) (Math.random() * 80) + 30;
        int burnable_units = (int) (Math.random() * 100) + 10;
        return new int[]{plastic_units, glass_units, aluminum_units, burnable_units};
    }
}
