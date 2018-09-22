

package repetiton;


public class WetterWerteGUI extends java.awt.Frame {

   
    public WetterWerteGUI() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbTemp = new javax.swing.JLabel();
        jsTemp = new javax.swing.JSlider();
        lbLuftfeuchtigkeit = new javax.swing.JLabel();
        jsLuftfeuchtigkeit = new javax.swing.JSlider();
        btEinfügen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlList = new javax.swing.JList<>();
        menuBar1 = new java.awt.MenuBar();
        menuEdit = new java.awt.Menu();
        miSpeichern = new java.awt.MenuItem();
        miLaden = new java.awt.MenuItem();
        miBeenden = new java.awt.MenuItem();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jLabel1.setText("Eingabe");

        jLabel2.setText("Anzeige");

        lbTemp.setText("Temperatur 18°");

        jsTemp.setMajorTickSpacing(10);
        jsTemp.setMaximum(40);
        jsTemp.setMinimum(-20);
        jsTemp.setMinorTickSpacing(5);
        jsTemp.setPaintLabels(true);
        jsTemp.setPaintTicks(true);
        jsTemp.setValue(18);
        jsTemp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onTempChanged(evt);
            }
        });

        lbLuftfeuchtigkeit.setText("Luftfeuchtigkeit: 52%");

        jsLuftfeuchtigkeit.setMajorTickSpacing(20);
        jsLuftfeuchtigkeit.setMinorTickSpacing(10);
        jsLuftfeuchtigkeit.setPaintLabels(true);
        jsLuftfeuchtigkeit.setPaintTicks(true);
        jsLuftfeuchtigkeit.setValue(52);
        jsLuftfeuchtigkeit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onLuftChanged(evt);
            }
        });

        btEinfügen.setText("Einfügen");
        btEinfügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onEinfügen(evt);
            }
        });

        jlList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btEinfügen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbLuftfeuchtigkeit, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jsTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbTemp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEinfügen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        menuEdit.setLabel("Edit");

        miSpeichern.setLabel("Datei-Speichern");
        menuEdit.add(miSpeichern);

        miLaden.setLabel("Datei-Laden");
        menuEdit.add(miLaden);

        miBeenden.setLabel("Datei-Beenden");
        menuEdit.add(miBeenden);

        menuBar1.add(menuEdit);

        setMenuBar(menuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void onEinfügen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onEinfügen
        // TODO add your handling code here:
    }//GEN-LAST:event_onEinfügen

    private void onLuftChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onLuftChanged
        System.out.println("Ding");
    }//GEN-LAST:event_onLuftChanged

    private void onTempChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onTempChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_onTempChanged

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WetterWerteGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEinfügen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlList;
    private javax.swing.JSlider jsLuftfeuchtigkeit;
    private javax.swing.JSlider jsTemp;
    private javax.swing.JLabel lbLuftfeuchtigkeit;
    private javax.swing.JLabel lbTemp;
    private java.awt.MenuBar menuBar1;
    private java.awt.Menu menuEdit;
    private java.awt.MenuItem miBeenden;
    private java.awt.MenuItem miLaden;
    private java.awt.MenuItem miSpeichern;
    // End of variables declaration//GEN-END:variables

}
