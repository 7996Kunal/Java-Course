/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Frame1 extends java.awt.Frame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
        setSize(500,300);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        button16 = new java.awt.Button();
        button17 = new java.awt.Button();
        button18 = new java.awt.Button();
        button19 = new java.awt.Button();
        button21 = new java.awt.Button();
        button22 = new java.awt.Button();
        button23 = new java.awt.Button();
        button20 = new java.awt.Button();
        button24 = new java.awt.Button();
        button25 = new java.awt.Button();
        button26 = new java.awt.Button();
        button27 = new java.awt.Button();
        button28 = new java.awt.Button();
        button29 = new java.awt.Button();
        button30 = new java.awt.Button();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        l1.setAlignment(java.awt.Label.RIGHT);
        l1.setBackground(new java.awt.Color(255, 204, 204));
        l1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        add(l1);
        l1.setBounds(10, 40, 480, 40);

        button1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button1.setLabel("=");
        add(button1);
        button1.setBounds(390, 240, 90, 40);

        button2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button2.setLabel("1");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(230, 90, 40, 40);

        button3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button3.setLabel("2");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(280, 90, 40, 40);

        button4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button4.setLabel("6");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button4);
        button4.setBounds(330, 140, 40, 40);

        button5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button5.setLabel("4");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button5);
        button5.setBounds(230, 140, 40, 40);

        button6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button6.setLabel("5");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button6);
        button6.setBounds(280, 140, 40, 40);

        button7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button7.setLabel("9");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button7);
        button7.setBounds(330, 190, 40, 40);

        button8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button8.setLabel("7");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button8);
        button8.setBounds(230, 190, 40, 40);

        button9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button9.setLabel("8");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button9);
        button9.setBounds(280, 190, 40, 40);

        button10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button10.setLabel(".");
        add(button10);
        button10.setBounds(330, 240, 40, 40);

        button11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button11.setLabel("+/-");
        add(button11);
        button11.setBounds(230, 240, 40, 40);

        button12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button12.setLabel("0");
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button12);
        button12.setBounds(280, 240, 40, 40);

        button13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button13.setLabel("+");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button13);
        button13.setBounds(390, 140, 40, 40);

        button14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button14.setLabel("-");
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button14);
        button14.setBounds(440, 140, 40, 40);

        button15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button15.setLabel("/");
        add(button15);
        button15.setBounds(440, 190, 40, 40);

        button16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button16.setLabel("x");
        add(button16);
        button16.setBounds(390, 190, 40, 40);

        button17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button17.setLabel("3");
        button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button17);
        button17.setBounds(330, 90, 40, 40);

        button18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button18.setLabel("ON/AC");
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });
        add(button18);
        button18.setBounds(390, 90, 90, 40);

        button19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button19.setLabel("<---");
        button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button19ActionPerformed(evt);
            }
        });
        add(button19);
        button19.setBounds(160, 90, 60, 40);

        button21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button21.setLabel("1");
        add(button21);
        button21.setBounds(160, 190, 60, 40);

        button22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button22.setLabel("1");
        add(button22);
        button22.setBounds(160, 240, 60, 40);

        button23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button23.setLabel("Sqrt");
        button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button23ActionPerformed(evt);
            }
        });
        add(button23);
        button23.setBounds(160, 140, 60, 40);

        button20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button20.setLabel("1");
        add(button20);
        button20.setBounds(90, 90, 60, 40);

        button24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button24.setLabel("1");
        add(button24);
        button24.setBounds(90, 190, 60, 40);

        button25.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button25.setLabel("1");
        add(button25);
        button25.setBounds(90, 240, 60, 40);

        button26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button26.setLabel("1");
        add(button26);
        button26.setBounds(90, 140, 60, 40);

        button27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button27.setLabel("1");
        add(button27);
        button27.setBounds(10, 90, 60, 40);

        button28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button28.setLabel("1");
        add(button28);
        button28.setBounds(10, 190, 60, 40);

        button29.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button29.setLabel("1");
        add(button29);
        button29.setBounds(10, 240, 60, 40);

        button30.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button30.setLabel("1");
        add(button30);
        button30.setBounds(10, 140, 60, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        String s1=l1.getText();
        String s2=evt.getActionCommand();
        l1.setText(s1+s2);
    }//GEN-LAST:event_button2ActionPerformed

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
        // TODO add your handling code here:
        l1.setText("");
    }//GEN-LAST:event_button18ActionPerformed

    private void button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button19ActionPerformed
        // TODO add your handling code here:
        String s=l1.getText();
        int n=s.length();
        if(n>0)
        {
            String s1=s.substring(0,n-1);
            l1.setText(s1);
        }
    }//GEN-LAST:event_button19ActionPerformed

    private void button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button23ActionPerformed
        // TODO add your handling code here:
        String s=l1.getText();
        double d=Double.parseDouble(s);
        double d1=Math.sqrt(d);
        l1.setText(d1+"");
    }//GEN-LAST:event_button23ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button17;
    private java.awt.Button button18;
    private java.awt.Button button19;
    private java.awt.Button button2;
    private java.awt.Button button20;
    private java.awt.Button button21;
    private java.awt.Button button22;
    private java.awt.Button button23;
    private java.awt.Button button24;
    private java.awt.Button button25;
    private java.awt.Button button26;
    private java.awt.Button button27;
    private java.awt.Button button28;
    private java.awt.Button button29;
    private java.awt.Button button3;
    private java.awt.Button button30;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.Label l1;
    // End of variables declaration//GEN-END:variables
}
