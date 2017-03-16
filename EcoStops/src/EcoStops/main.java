/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author cgcv
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        MemberList = new LinkedList();
        Prizes = new Queue();
        graph = createMultigraph();
        TrafficChangerThread t1 = new TrafficChangerThread(graph);        
        t1.run();
                       
        graph.display();

        MemberList.insert(new Member("Caca", "Roto", 123, "321dsasd", 20, true), 0);
        DefaultListModel m = (DefaultListModel) this.jl_memberList.getModel();
        m.addElement(new Member("Caca", "Roto", 123, "321dsasd", 20, true));
        this.jl_memberList.setModel(m);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        window_Register = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_lastname = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        rb_fem = new javax.swing.JRadioButton();
        rb_man = new javax.swing.JRadioButton();
        tf_numtel = new javax.swing.JTextField();
        jb_register = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rb_miembro = new javax.swing.JRadioButton();
        rb_empleado = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        cb_ecoStops = new javax.swing.JComboBox<>();
        bg_registerw = new javax.swing.ButtonGroup();
        window_delete = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_memberList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jb_deleteMember = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mi_help = new javax.swing.JMenuItem();
        windows_DelHelp = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bg_tipo = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_RegistrarMiembro = new javax.swing.JMenuItem();
        mi_deleteMember = new javax.swing.JMenuItem();

        jLabel1.setText("REGISTRO");

        jLabel3.setText("Nombre");

        jLabel6.setText("Apellido");

        jLabel7.setText("Genero");

        jLabel8.setText("Num.Tel");

        jLabel9.setText("Edad");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(18, 18, 149, 1));

        bg_registerw.add(rb_fem);
        rb_fem.setText("Femenino");

        bg_registerw.add(rb_man);
        rb_man.setText("Masculino");

        jb_register.setText("Agregar nuevo registro");
        jb_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registerMouseClicked(evt);
            }
        });

        jLabel14.setText("Num ID");

        jLabel15.setText("Tipo");

        bg_tipo.add(rb_miembro);
        rb_miembro.setText("Miembro");
        rb_miembro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_miembroItemStateChanged(evt);
            }
        });

        bg_tipo.add(rb_empleado);
        rb_empleado.setText("Empleado");
        rb_empleado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_empleadoItemStateChanged(evt);
            }
        });

        jLabel16.setText("Donde trabajara el empleado?");
        jLabel16.setEnabled(false);

        cb_ecoStops.setEnabled(false);

        javax.swing.GroupLayout window_RegisterLayout = new javax.swing.GroupLayout(window_Register.getContentPane());
        window_Register.getContentPane().setLayout(window_RegisterLayout);
        window_RegisterLayout.setHorizontalGroup(
            window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(window_RegisterLayout.createSequentialGroup()
                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(window_RegisterLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8)))
                    .addGroup(window_RegisterLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_man)
                            .addComponent(rb_fem)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rb_empleado)
                    .addComponent(rb_miembro)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(window_RegisterLayout.createSequentialGroup()
                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(window_RegisterLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, window_RegisterLayout.createSequentialGroup()
                                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(46, 46, 46)
                                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_numtel)
                                    .addComponent(tf_ID)
                                    .addGroup(window_RegisterLayout.createSequentialGroup()
                                        .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_lastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(window_RegisterLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_register)
                            .addComponent(cb_ecoStops, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        window_RegisterLayout.setVerticalGroup(
            window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(window_RegisterLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, window_RegisterLayout.createSequentialGroup()
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, window_RegisterLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(55, 55, 55)
                        .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_numtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(window_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(window_RegisterLayout.createSequentialGroup()
                        .addComponent(rb_miembro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_empleado))
                    .addGroup(window_RegisterLayout.createSequentialGroup()
                        .addComponent(rb_fem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_man)))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_ecoStops, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jb_register)
                .addContainerGap())
        );

        jl_memberList.setModel(new DefaultListModel());
        jl_memberList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_memberListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_memberList);

        jLabel2.setText("LISTA DE MIEMBROS");

        jb_deleteMember.setText("Borrar Registro");
        jb_deleteMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_deleteMemberMouseClicked(evt);
            }
        });
        jb_deleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteMemberActionPerformed(evt);
            }
        });

        jMenu2.setText("Opcion");

        mi_help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mi_help.setText("Ayuda...");
        mi_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_helpActionPerformed(evt);
            }
        });
        jMenu2.add(mi_help);

        jMenuBar2.add(jMenu2);

        window_delete.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout window_deleteLayout = new javax.swing.GroupLayout(window_delete.getContentPane());
        window_delete.getContentPane().setLayout(window_deleteLayout);
        window_deleteLayout.setHorizontalGroup(
            window_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(window_deleteLayout.createSequentialGroup()
                .addGroup(window_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(window_deleteLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(window_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(window_deleteLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jb_deleteMember)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        window_deleteLayout.setVerticalGroup(
            window_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(window_deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jb_deleteMember)
                .addContainerGap())
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Para eliminar un registro,\nseleccione un elemento de la\nlista y luego presione el\nbotón de \"aceptar\".");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout windows_DelHelpLayout = new javax.swing.GroupLayout(windows_DelHelp.getContentPane());
        windows_DelHelp.getContentPane().setLayout(windows_DelHelpLayout);
        windows_DelHelpLayout.setHorizontalGroup(
            windows_DelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windows_DelHelpLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        windows_DelHelpLayout.setVerticalGroup(
            windows_DelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windows_DelHelpLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Opciones");

        mi_RegistrarMiembro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mi_RegistrarMiembro.setText("Registrar nuevo Miembro");
        mi_RegistrarMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_RegistrarMiembroActionPerformed(evt);
            }
        });
        jMenu1.add(mi_RegistrarMiembro);

        mi_deleteMember.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mi_deleteMember.setText("Borrar Miembros");
        mi_deleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_deleteMemberActionPerformed(evt);
            }
        });
        jMenu1.add(mi_deleteMember);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_RegistrarMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_RegistrarMiembroActionPerformed
        this.window_Register.pack();
        this.window_Register.show();
    }//GEN-LAST:event_mi_RegistrarMiembroActionPerformed

    private void jb_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registerMouseClicked
        String name = this.tf_name.getText();
        String last_name = this.tf_lastname.getText();
        int ID;
        String phone = this.tf_numtel.getText();
        int age = (int) this.jSpinner2.getValue();
        boolean gender = false;

        if (this.rb_fem.isSelected()) {
            gender = true;
        } else if (this.rb_man.isSelected()) {
            gender = false;
        }
        Person asd = new Member("1232122", name, last_name, 00000001, phone, age, gender);
        Member temp = new Member("1232122", name, last_name, 00000001, phone, age, gender);
        System.out.println(temp.toString());

        int numero = (int) (Math.random() * 100) + 20;
        System.out.println(numero);

        int x = JOptionPane.showConfirmDialog(this.window_Register, "¿Desea continuar");

        if (x == 1) {
            this.window_Register.dispose();
        }

    }//GEN-LAST:event_jb_registerMouseClicked

    private void mi_deleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_deleteMemberActionPerformed
        this.window_delete.pack();
        this.window_delete.show();
    }//GEN-LAST:event_mi_deleteMemberActionPerformed

    private void mi_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_helpActionPerformed
        this.windows_DelHelp.pack();
        this.windows_DelHelp.show();

    }//GEN-LAST:event_mi_helpActionPerformed

    private void jb_deleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_deleteMemberActionPerformed

    private void jb_deleteMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_deleteMemberMouseClicked

        if (this.jl_memberList.getSelectedIndex() > -1) {
            int selected = this.jl_memberList.getSelectedIndex();
            this.MemberList.remove(selected);
            DefaultListModel model = (DefaultListModel) this.jl_memberList.getModel();
            model.clear();

            if (MemberList.Size() > 0) {
                for (int i = 0; i < MemberList.Size() - 1; i++) {
                    model.addElement(MemberList.get(i));
                }
            }

            this.jl_memberList.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this.window_delete, "Seleccione un elemento valido");
        }


    }//GEN-LAST:event_jb_deleteMemberMouseClicked

    private void jl_memberListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_memberListMouseClicked
        System.out.println(this.jl_memberList.getSelectedIndex());
    }//GEN-LAST:event_jl_memberListMouseClicked

    private void rb_miembroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_miembroItemStateChanged
        if (this.rb_miembro.isSelected()) {
            this.cb_ecoStops.setEnabled(false);
            this.jLabel16.setEnabled(false);
            this.jLabel16.setVisible(false);
            this.cb_ecoStops.setVisible(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_rb_miembroItemStateChanged

    private void rb_empleadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_empleadoItemStateChanged
        if (this.rb_empleado.isSelected()) {
            this.cb_ecoStops.setEnabled(true);
            this.jLabel16.setEnabled(true);
            this.jLabel16.setVisible(true);
            this.cb_ecoStops.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_empleadoItemStateChanged

    public void PrizeGenerator() {
        int numero = (int) (Math.random() * 1) + 4;
        // System.out.println(numero);

        switch (numero) {
            case 1:
                Prizes.Queue("$25");
                break;
            case 2:
                Prizes.Queue("Game Voucher");
                break;
            case 3:
                Prizes.Queue("Tuxedo Voucher");
                break;
            case 4:
                Prizes.Queue("Super Baleadas Ticket");
                break;
            default:
        }
    }

    public String GenerateID() {
        String code_chars = "abcdfghijklnopqrstuvwxyz1234567890";

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            sb.append(code_chars.charAt(random.nextInt(code_chars
                    .length())));
        }
        return sb.toString();
    }

    

    private MultiGraph createMultigraph() {
        MultiGraph retgraph = new MultiGraph("Map");
        retgraph.setStrict(false);
        ArrayList<EcoStop> stops = new ArrayList();
        for (int i = 0; i < 25; i++) {
            stops.add(new EcoStop(i));
        }
        ProcessingPlant a = new ProcessingPlant(0, 0, 0, 0, 'A', 0);
        ProcessingPlant b = new ProcessingPlant(0, 0, 0, 0, 'B', 0);
        ProcessingPlant c = new ProcessingPlant(0, 0, 0, 0, 'C', 0);
        ProcessingPlant d = new ProcessingPlant(0, 0, 0, 0, 'D', 0);
        ProcessingPlant e = new ProcessingPlant(0, 0, 0, 0, 'E', 0);

        retgraph.addNode("" + a.getID()).addAttribute("ProcessingPlant", a);
        retgraph.addNode("" + b.getID()).addAttribute("ProcessingPlant", b);
        retgraph.addNode("" + c.getID()).addAttribute("ProcessingPlant", c);
        retgraph.addNode("" + d.getID()).addAttribute("ProcessingPlant", d);
        retgraph.addNode("" + e.getID()).addAttribute("ProcessingPlant", e);

        for (int i = 0; i < stops.size(); i++) {
            retgraph.addNode("" + stops.get(i).getID()).addAttribute("EcoStop", stops.get(i));
        }
       
        
        retgraph.addEdge("0-1", "0", "1", true);
        retgraph.addEdge("1-0", "1", "0", true);
        retgraph.addEdge("0-D", "0", "D", true);
        retgraph.addEdge("D-0", "D", "0", true);
        retgraph.addEdge("1-2", "1", "2", true);
        retgraph.addEdge("2-1", "2", "1", true);
        retgraph.addEdge("2-3", "2", "3", true);
        retgraph.addEdge("3-2", "3", "2", true);
        retgraph.addEdge("2-10", "2", "10", true);
        retgraph.addEdge("10-2", "10", "2", true);
        retgraph.addEdge("10-3", "10", "3", true);
        retgraph.addEdge("3-10", "3", "10", true);
        retgraph.addEdge("3-4", "3", "4", true);
        retgraph.addEdge("4-3", "4", "3", true);
        retgraph.addEdge("4-5", "4", "5", true);
        retgraph.addEdge("5-4", "5", "4", true);
        retgraph.addEdge("0-5", "0", "5", true);
        retgraph.addEdge("5-0", "5", "0", true);
        retgraph.addEdge("5-6", "5", "6", true);
        retgraph.addEdge("5-8", "8", "5", true);
        retgraph.addEdge("8-5", "8", "5", true);
        retgraph.addEdge("8-7", "8", "7", true);
        retgraph.addEdge("7-8", "7", "8", true);
        retgraph.addEdge("6-5", "6", "5", true);
        retgraph.addEdge("6-E", "6", "E", true);
        retgraph.addEdge("E-6", "E", "6", true);
        retgraph.addEdge("6-7", "6", "7", true);
        retgraph.addEdge("7-6", "7", "6", true);
        retgraph.addEdge("8-14", "8", "14", true);
        retgraph.addEdge("14-8", "14", "8", true);
        retgraph.addEdge("14-9", "14", "9", true);
        retgraph.addEdge("9-14", "9", "14", true);
        retgraph.addEdge("14-13", "14", "13", true);
        retgraph.addEdge("13-14", "13", "14", true);
        retgraph.addEdge("13-12", "13", "12", true);
        retgraph.addEdge("12-13", "12", "13", true);
        retgraph.addEdge("10-12", "10", "12", true);
        retgraph.addEdge("12-10", "12", "10", true);
        retgraph.addEdge("12-11", "12", "11", true);
        retgraph.addEdge("11-12", "11", "12", true);
        retgraph.addEdge("12-17", "12", "17", true);
        retgraph.addEdge("17-12", "17", "12", true);
        retgraph.addEdge("2-11", "2", "11", true);
        retgraph.addEdge("11-A", "11", "A", true);
        retgraph.addEdge("A-11", "A", "11", true);
        retgraph.addEdge("11-16", "11", "16", true);
        retgraph.addEdge("16-11", "16", "11", true);
        retgraph.addEdge("16-22", "16", "22", true);
        retgraph.addEdge("22-16", "22", "16", true);
        retgraph.addEdge("22-12", "22", "12", true);
        retgraph.addEdge("12-22", "12", "22", true);
        retgraph.addEdge("22-23", "22", "23", true);
        retgraph.addEdge("23-22", "23", "22", true);
        retgraph.addEdge("23-21", "23", "21", true);
        retgraph.addEdge("21-B", "21", "B", true);
        retgraph.addEdge("B-21", "B", "21", true);
        retgraph.addEdge("13-21", "13", "21", true);
        retgraph.addEdge("21-13", "21", "13", true);
        retgraph.addEdge("21-24", "21", "24", true);
        retgraph.addEdge("24-21", "24", "21", true);
        retgraph.addEdge("23-24", "23", "24", true);
        retgraph.addEdge("24-23", "24", "23", true);
        retgraph.addEdge("21-19", "21", "19", true);
        retgraph.addEdge("19-21", "19", "21", true);
        retgraph.addEdge("20-19", "20", "19", true);
        retgraph.addEdge("19-20", "19", "20", true);
        retgraph.addEdge("19-18", "19", "18", true);
        retgraph.addEdge("18-19", "18", "19", true);
        retgraph.addEdge("18-C", "18", "C", true);
        retgraph.addEdge("C-18", "C", "18", true);
        retgraph.addEdge("15-18", "15", "18", true);
        retgraph.addEdge("18-15", "18", "15", true);
        retgraph.addEdge("20-15", "20", "15", true);
        retgraph.addEdge("15-20", "15", "20", true);
        retgraph.addEdge("8-18", "8", "18", true);
        retgraph.addEdge("18-8", "18", "8", true);
        retgraph.addEdge("7-15", "7", "15", true);
        retgraph.addEdge("15-7", "15", "7", true);

        for (Node node : retgraph) {
            node.addAttribute("ui.label", node.getId());
        }
        return retgraph;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_registerw;
    private javax.swing.ButtonGroup bg_tipo;
    private javax.swing.JComboBox<String> cb_ecoStops;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jb_deleteMember;
    private javax.swing.JButton jb_register;
    private javax.swing.JList<String> jl_memberList;
    private javax.swing.JMenuItem mi_RegistrarMiembro;
    private javax.swing.JMenuItem mi_deleteMember;
    private javax.swing.JMenuItem mi_help;
    private javax.swing.JRadioButton rb_empleado;
    private javax.swing.JRadioButton rb_fem;
    private javax.swing.JRadioButton rb_man;
    private javax.swing.JRadioButton rb_miembro;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_lastname;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_numtel;
    private javax.swing.JDialog window_Register;
    private javax.swing.JDialog window_delete;
    private javax.swing.JDialog windows_DelHelp;
    // End of variables declaration//GEN-END:variables
    private LinkedList MemberList;
    private Queue Prizes;
    private int contador_miembros;
    private MultiGraph graph;
}