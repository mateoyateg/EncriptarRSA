package encriptar;

import javax.swing.JOptionPane;

public class seen extends javax.swing.JFrame {
    
    int q, n, fi, z,s; 
    int p;
    
    private char[] transCad;
    private int[] transAscii;
    
    Encriptar e = new Encriptar();

    public seen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nump = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numq = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        palabra = new javax.swing.JTextField();
        encri = new javax.swing.JButton();
        desencri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese p: ");

        nump.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numpActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese q:");

        numq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numqActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Ingrese n: ");

        numn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Ingrese la palabra a encriptar: ");

        palabra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabraActionPerformed(evt);
            }
        });

        encri.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        encri.setText("Encriptar");
        encri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriActionPerformed(evt);
            }
        });

        desencri.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        desencri.setText("Desencriptar");
        desencri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nump))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encri)
                        .addGap(18, 18, 18)
                        .addComponent(desencri)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(numq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(palabra)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(encri)
                            .addComponent(desencri))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numpActionPerformed

    }//GEN-LAST:event_numpActionPerformed

    private void numqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numqActionPerformed

    private void numnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numnActionPerformed

    private void palabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabraActionPerformed

    private void encriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriActionPerformed
        String ps = nump.getText();
        p=Integer.parseInt(ps);
        
        String qs = numq.getText();
        q=Integer.parseInt(qs);
        
        String ns = numn.getText();
        n=Integer.parseInt(ns);
        
        String palabra2 = palabra.getText();
        
        transCad = e.transcribirCadena(palabra2);
        
        transAscii = e.asciiCadena(transCad) ;
        
        fi = (p-1)*(q-1);
        z=p*q;
        
        s=n+1;
        
        while ( (n*s)%fi !=1 ){
          s++;  
        }
        
        System.out.println(transAscii[0]);
        System.out.println(z);
        
        double ñame = (Math.pow(transAscii[0], n));
        System.out.println(ñame % z);
        
        System.out.println(ñame);
        /*if(p<23){
        JOptionPane.showMessageDialog(null, "Digite un número entre 23 y 5000");
        } else {
        System.out.println("Lo dijitaste bien c:");
        }*/
        
        
    }//GEN-LAST:event_encriActionPerformed

    private void desencriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desencriActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton desencri;
    private javax.swing.JButton encri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField numn;
    private javax.swing.JTextField nump;
    private javax.swing.JTextField numq;
    private javax.swing.JTextField palabra;
    // End of variables declaration//GEN-END:variables
}
