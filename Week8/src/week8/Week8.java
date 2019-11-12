/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author 4littc85
 */

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Week8 extends JFrame 
    {
     
        private JLabel lblRegNo;
        private JLabel lblColour;
        //private JLabel lblMake;
        //private JLabel lblModel;
        private JLabel lblStatus;
        
        private JTextField txtRegNo;
        private JTextField txtColour;
       // private JTextField txtMake;
       // private JTextField txtModel;
        
        private JButton btnAdd;
        private JButton btnRemove;
        private GridBagConstraints constraints;
        
    
    public Week8 () {
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        initComponents();
        layoutComponents();

    
    public void initComponents()
        {
            lblRegNo = new JLabel("Registration No:");
            lblColour = new JLabel("Colour:");
            lblStatus = new JLabel("There are 15 spaces");
            txtRegNo = new JTextField ();
            txtColour = new JTextField ();
            btnAdd = new JButton("Add Car");
            btnRemove = new JButton("Remove Car");
           
    }

    public void layoutComponents()
    {
           constraints.gridy = 0;
           constraints.gridx = 0;
           this.add(lblRegNo, constraints);
           
           constraints.gridx = 0;
           constraints.fill = GridBagConstraints.HORIZONTAL;
           this.add(txtRegNo, constraints);
           
           
           constraints.gridy = 1;
           constraints.gridx = 0;
           constraints.fill = GridBagConstraints.NONE;
           this.add(lblColour, constraints); 
           
           constraints.gridx = 1;
           constraints.fill = GridBagConstraints.HORIZONTAL;
           this.add(txtColour, constraints);
           
           constraints.gridy = 2;
           constraints.gridx = 0;
           constraints.gridwidth = 2;
           constraints.fill = GridBagConstraints.NONE;
           this.add(lblStatus, constraints); 
           
           constraints.gridy = 3;
           constraints.gridwidth = 1;
           this.add(btnAdd, constraints); 
           
           constraints.gridy = 1;
           this.add(btnRemove, constraints); 
    }

}
