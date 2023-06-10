package stackvisualproject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MainPage extends javax.swing.JFrame {

    public MainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        stack2 = new javax.swing.JLabel();
        stack1 = new javax.swing.JLabel();
        stack3 = new javax.swing.JLabel();
        stack4 = new javax.swing.JLabel();
        stack7 = new javax.swing.JLabel();
        stack8 = new javax.swing.JLabel();
        stack6 = new javax.swing.JLabel();
        stack5 = new javax.swing.JLabel();
        pushbtn = new javax.swing.JButton();
        pushtf = new javax.swing.JTextField();
        popbtn = new javax.swing.JButton();
        top2 = new javax.swing.JLabel();
        top1 = new javax.swing.JLabel();
        top4 = new javax.swing.JLabel();
        top3 = new javax.swing.JLabel();
        top8 = new javax.swing.JLabel();
        top7 = new javax.swing.JLabel();
        top6 = new javax.swing.JLabel();
        top5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STACK VISUALIZATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 819, 43));

        jPanel2.setBorder(BorderFactory.createMatteBorder(0, 2, 2, 2, Color.BLACK));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stack2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 110, 40));

        stack1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 110, 40));

        stack3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 110, 40));

        stack4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 110, 40));

        stack7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 110, 40));

        stack8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 40));

        stack6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 110, 40));

        stack5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 110, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 85, -1, -1));

        pushbtn.setText("PUSH");
        pushbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pushbtnMouseClicked(evt);
            }
        });
        jPanel1.add(pushbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 456, 93, 34));

        pushtf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        pushtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pushtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushtfActionPerformed(evt);
            }
        });
        jPanel1.add(pushtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 456, 110, 34));

        popbtn.setText("POP");
        popbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popbtnMouseClicked(evt);
            }
        });
        popbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popbtnActionPerformed(evt);
            }
        });
        jPanel1.add(popbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 456, 90, 34));

        top2.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMIL RAZA\\Downloads\\arrow2.png")); // NOI18N
        top2.setText("top");
        top2.setEnabled(false);
        jPanel1.add(top2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 66, 30));

        top1.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMIL RAZA\\Downloads\\arrow2.png")); // NOI18N
        top1.setEnabled(false);
        jPanel1.add(top1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 66, 30));

        top4.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMIL RAZA\\Downloads\\arrow2.png")); // NOI18N
        top4.setEnabled(false);
        jPanel1.add(top4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 66, 30));

        top3.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMIL RAZA\\Downloads\\arrow2.png")); // NOI18N
        top3.setEnabled(false);
        jPanel1.add(top3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 66, 30));

        top8.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMIL RAZA\\Downloads\\arrow2.png")); // NOI18N
        top8.setEnabled(false);
        jPanel1.add(top8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 66, 30));

        top7.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMIL RAZA\\Downloads\\arrow2.png")); // NOI18N
        top7.setEnabled(false);
        jPanel1.add(top7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 66, 30));

        top6.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMIL RAZA\\Downloads\\arrow2.png")); // NOI18N
        top6.setEnabled(false);
        jPanel1.add(top6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 66, 30));

        top5.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMIL RAZA\\Downloads\\arrow2.png")); // NOI18N
        top5.setEnabled(false);
        jPanel1.add(top5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 66, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pushtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pushtfActionPerformed

    private void pushbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pushbtnMouseClicked
        labels = new ArrayList<>(Arrays.asList(stack1,stack2,stack3,stack4,stack5,stack6,stack7,stack8));
        String pushText = pushtf.getText();
        stack.push(pushText);        
        if(i<8){
        labels.get(i).setText(stack.peek());
        labels.get(i).setBorder(BorderFactory.createMatteBorder(3, 0, 0, 0, Color.BLACK));
        i++;
            System.out.println(i);
        } else {
            JOptionPane.showMessageDialog(this, "Stack Overflow");
        }
        
        pushtf.setText("");
    }//GEN-LAST:event_pushbtnMouseClicked

    private void popbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popbtnActionPerformed

    private void popbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popbtnMouseClicked
        if(i>0){
        labels.get(--i).setText("");
        labels.get(i).setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
        }
        else{
            JOptionPane.showMessageDialog(this, "Stack is Empty");            
        }
    }//GEN-LAST:event_popbtnMouseClicked
    static Stack<String> stack;
    static ArrayList<JLabel> labels;
    static int i=0;
    public static void main(String args[]) {
         
        stack = new Stack<>();
//        for(int j=0; j<8; i++){
//            arrowlabels.get(i).setVisible(false);
//        }
 
        
        
        // Refresh the panel to update the UI
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    void kuchbhi(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton popbtn;
    private javax.swing.JButton pushbtn;
    private javax.swing.JTextField pushtf;
    private javax.swing.JLabel stack1;
    private javax.swing.JLabel stack2;
    private javax.swing.JLabel stack3;
    private javax.swing.JLabel stack4;
    private javax.swing.JLabel stack5;
    private javax.swing.JLabel stack6;
    private javax.swing.JLabel stack7;
    private javax.swing.JLabel stack8;
    private javax.swing.JLabel top1;
    private javax.swing.JLabel top2;
    private javax.swing.JLabel top3;
    private javax.swing.JLabel top4;
    private javax.swing.JLabel top5;
    private javax.swing.JLabel top6;
    private javax.swing.JLabel top7;
    private javax.swing.JLabel top8;
    // End of variables declaration//GEN-END:variables
}
